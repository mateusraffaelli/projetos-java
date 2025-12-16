package jogos;
import java.util.Random;
import java.util.Scanner;

public class BatalhaNaval {
    // ============================================================
    // CONSTANTES DO JOGO
    // ============================================================
    final static int TAM_MAT = 10;
    final static int MAX_TIROS = 20; // TIRAR
    // IDs dos navios
    final static int LIVRE = 0;
    final static int PORTA_AVIOES = 1;
    final static int FRAGATA = 2;
    final static int SUBMARINO = 3;
    // Resultado do jogo
    final static int EM_ANDAMENTO = 0;
    final static int VITORIA = 1;
    final static int DERROTA = 2;
    // Quantidade de navios (conforme PDF)
    final static int NUM_PORTA_AVIOES = 1;
    final static int NUM_FRAGATAS = 5;
    final static int NUM_SUBMARINOS = 5;
    // Pontuação
    final static int PONTOS_PORTA_AVIOES = 100;
    final static int PONTOS_FRAGATA = 20;
    final static int PONTOS_SUBMARINO = 50;
    // ============================================================
    // VARIÁVEIS DO JOGO
    // ============================================================
    static int[][] tabuleiroJogador = new int[TAM_MAT][TAM_MAT];
    static int[][] tabuleiroIA = new int[TAM_MAT][TAM_MAT]; 
    static int pontuacao = 0;
    static int pontuacaoIA = 0; 
    static int contadorTiros = 0;
    static final Random rand = new Random();
    static final Scanner teclado = new Scanner(System.in);
    // Ativa ou desativa visualização dos navios
    static boolean modoDebug = false;

    // ============================================================
    // FUNÇÕES AUXILIARES
    // ============================================================
    // Entrada segura
    static int lerInteiro(String msg) {
        while (true) {
            System.out.print(msg);
            String entrada = teclado.next();
            if (entrada.matches("\\d+"))
                return Integer.parseInt(entrada);
            System.out.println("Entrada inválida! Digite um número.");
        }
    }

    // Validação de posições
    static boolean posicaoValida(int x, int y) {
        return x >= 0 && x < TAM_MAT && y >= 0 && y < TAM_MAT;
    }

    static boolean posicaoJaAlvejada(int[][] tabuleiro, int x, int y) { 
        return tabuleiro[x][y] >= 10;
    }

    static boolean todosNaviosAtingidos(int[][] tabuleiro) {
        for (int i = 0; i < TAM_MAT; i++)
            for (int j = 0; j < TAM_MAT; j++)
                if (tabuleiro[i][j] == PORTA_AVIOES ||
                        tabuleiro[i][j] == FRAGATA ||
                        tabuleiro[i][j] == SUBMARINO)
                    return false;
        return true;
    }

    static void atualizarPontuacao(int id) {
        switch (id) {
            case PORTA_AVIOES:
                pontuacao += PONTOS_PORTA_AVIOES;
                break;
            case FRAGATA:
                pontuacao += PONTOS_FRAGATA;
                break;
            case SUBMARINO:
                pontuacao += PONTOS_SUBMARINO;
                break;
        }
    }

    // ============================================================
    // IMPRESSÃO DO TABULEIRO
    // ============================================================
    public static void imprimeMatriz() {
        System.out.println("\n     SEU TABULEIRO              TABULEIRO DA IA");
        System.out.print("   ");
        
        // Cabeçalho do tabuleiro do jogador
        for (int y = 0; y < TAM_MAT; y++)
            System.out.printf(" %2d", y);
        
        System.out.print("        ");
        
        // Cabeçalho do tabuleiro da IA
        for (int y = 0; y < TAM_MAT; y++)
            System.out.printf(" %2d", y);
        
        System.out.println();
        System.out.println("   " + " --".repeat(TAM_MAT) + "        " + " --".repeat(TAM_MAT));
        
        for (int x = 0; x < TAM_MAT; x++) {
            // Linha do tabuleiro do jogador
            System.out.printf("%2d |", x);
            for (int y = 0; y < TAM_MAT; y++) {
                char simbolo = getSimboloTabuleiro(tabuleiroJogador[x][y], true);
                System.out.printf(" %2c", simbolo);
            }
            
            System.out.print("      ");
            
            // Linha do tabuleiro da IA
            System.out.printf("%2d |", x);
            for (int y = 0; y < TAM_MAT; y++) {
                char simbolo = getSimboloTabuleiro(tabuleiroIA[x][y], false);
                System.out.printf(" %2c", simbolo);
            }
            
            System.out.println();
        }
    }

    static char getSimboloTabuleiro(int valor, boolean revelarNavios) {
        if (valor < 10) {
            // Não foi alvejado
            if (valor > 0) {  
                if (modoDebug) {
                    return (char)(valor + '0'); // Mostra número no debug
                }
                if (revelarNavios) { 
                    return 'N';
                }
                return '~';  
            }
            return '~'; // Água
        } else {
            // Foi alvejado
            int id = valor - 10;
            return (id == LIVRE ? '*' : 'X');
        }
    }

    // ============================================================
    // POSICIONAMENTO DE NAVIOS
    // ============================================================
    static void posicionarNavios(int[][] tabuleiro, int tipo, int qtd) {  
        while (qtd > 0) {
            int x = rand.nextInt(TAM_MAT);
            int y = rand.nextInt(TAM_MAT);
            if (tabuleiro[x][y] == LIVRE) { 
                tabuleiro[x][y] = tipo;
                qtd--;
            }
        }
    }

    static void posicionarTodosOsNavios(int[][] tabuleiro) {
        posicionarNavios(tabuleiro, PORTA_AVIOES, NUM_PORTA_AVIOES);
        posicionarNavios(tabuleiro, FRAGATA, NUM_FRAGATAS);
        posicionarNavios(tabuleiro, SUBMARINO, NUM_SUBMARINOS);
    }

    // ============================================================
    // MÉTODO TIRO() JOGADOR
    // ============================================================
    static void tiro() {
        System.out.println("\n--- TENTATIVA DE TIRO ---");
        // LER COORDENADAS COM PROTEÇÃO
        int x = lerInteiro("Digite a linha (0-9): ");
        int y = lerInteiro("Digite a coluna (0-9): ");

        
        if (posicaoValida(x, y)) {
            if (posicaoJaAlvejada(tabuleiroIA, x, y)) {
                System.out.println("Essa posição já foi alvejada"); 
            }else{
                int id = tabuleiroIA[x][y];
                atualizarPontuacao(id);
                tabuleiroIA[x][y] = tabuleiroIA[x][y] + 10; 
                if (tabuleiroIA[x][y] > 10) {
                    System.out.println("Você acertou!");
                }else{
                    System.out.println("Você errou!");
                }
                contadorTiros++;
            }
        }else{
            System.out.println("Posição Inválida");
        }
    }

    // ============================================================
    // MÉTODO TIRO() IA
    // ============================================================
    static void tiroIA() {
        System.out.println("\n--- VEZ DA IA ATACAR ---");
        
        int x, y;
        // loop pra procurar uma posição ainda não alvejada
        do {
            x = rand.nextInt(TAM_MAT);
            y = rand.nextInt(TAM_MAT);
        } while (posicaoJaAlvejada(tabuleiroJogador, x, y));
        
        System.out.println("A IA atirou em (" + x + "," + y + ")");

        int id = tabuleiroJogador[x][y];
        tabuleiroJogador[x][y] = tabuleiroJogador[x][y] + 10;
        if (tabuleiroJogador[x][y] > 10) {
            System.out.println("A IA acertou!");

            switch (id) {
            case PORTA_AVIOES:
                pontuacaoIA += PONTOS_PORTA_AVIOES;
                System.out.println("   (+100 pontos)");
                break;
            case FRAGATA:
                pontuacaoIA += PONTOS_FRAGATA;
                System.out.println("   (+20 pontos)");
                break;
            case SUBMARINO:
                pontuacaoIA += PONTOS_SUBMARINO;
                System.out.println("   (+50 pontos)");
                break;
        }
        }else{
            System.out.println("A IA errou!");
        } 
    }
    
    // ============================================================
    // VERIFICAR FIM DE JOGO
    // ============================================================
    static int verificarFimDeJogo() {
        if (todosNaviosAtingidos(tabuleiroIA)) {
            return VITORIA; // Você destruiu todos os navios
        }
        
        if (todosNaviosAtingidos(tabuleiroJogador)) {
            return DERROTA; // IA destruiu todos os navios
        }

        if (contadorTiros >= MAX_TIROS) {
            if (pontuacao > pontuacaoIA) {
                return VITORIA;  // Você ganhou por pontos
            } else {
                return DERROTA;  // IA ganhou por pontos 
            }
        }
        
        return EM_ANDAMENTO;
    }


    // ============================================================
    // MAIN
    // ============================================================
    public static void main(String[] args) {
        System.out.println("=== BATALHA NAVAL ===");
        teclado.nextLine(); // limpar buffer
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Ativar MODO DEBUG (s/n)? ");
        modoDebug = teclado.next().equalsIgnoreCase("s");

        posicionarTodosOsNavios(tabuleiroJogador);
        posicionarTodosOsNavios(tabuleiroIA);
        imprimeMatriz(); // no modo normal não revela navios
        int situacao = EM_ANDAMENTO;
        do {
            tiro();
            situacao = verificarFimDeJogo();
            if (situacao != EM_ANDAMENTO) break;
            System.out.println("\n Tiros restantes: " + (MAX_TIROS - contadorTiros));

            
            tiroIA();
            situacao = verificarFimDeJogo();
            if (situacao != EM_ANDAMENTO) break;

            System.out.println("\n === PLACAR ===");
            System.out.println("Você: " + pontuacao + " pontos");
            System.out.println("IA: " + pontuacaoIA + " pontos");

            imprimeMatriz();
        } while (situacao == EM_ANDAMENTO);

        String mensagem = "";
        if (situacao == VITORIA) {
            mensagem = "Você ganhou. Parabens!";
        }else if (situacao == DERROTA) {
            mensagem = "Você perdeu. Seus tiros acabaram";
        }

        System.out.println("\n === FIM DO JOGO ===");
        System.out.println("Nome do jogador: "  + nome);
        System.out.println("Tiros utilizados: " + contadorTiros);
        System.out.println(mensagem);
        System.out.println("\n === PLACAR FINAL ===");
        System.out.println("Você: " + pontuacao + " pontos");
        System.out.println("IA: " + pontuacaoIA + " pontos");
    }
}


