package jogos;
import java.util.Random;
import java.util.Scanner;

public class Teste {
    // ============================================================
    // CONSTANTES DO JOGO
    // ============================================================
    final static int TAM_MAT = 10;
    final static int MAX_TIROS = 20;
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
    static int[][] zonaDeGuerra = new int[TAM_MAT][TAM_MAT];
    static int contadorTiros = 0;
    static int pontuacao = 0;
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

    static boolean posicaoJaAlvejada(int x, int y) {
        return zonaDeGuerra[x][y] >= 10;
    }

    static boolean todosNaviosAtingidos() {
        for (int i = 0; i < TAM_MAT; i++)
            for (int j = 0; j < TAM_MAT; j++)
                if (zonaDeGuerra[i][j] == PORTA_AVIOES ||
                        zonaDeGuerra[i][j] == FRAGATA ||
                        zonaDeGuerra[i][j] == SUBMARINO)
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
        System.out.print(" ");
        for (int y = 0; y < TAM_MAT; y++)
            System.out.printf(" %2d", y);
        System.out.println("\n " + " --".repeat(TAM_MAT));
        for (int x = 0; x < TAM_MAT; x++) {
            System.out.printf("%2d |", x);
            for (int y = 0; y < TAM_MAT; y++) {
                int v = zonaDeGuerra[x][y];
                char simbolo;
                if (v < 10) {
                    if (!modoDebug)
                        simbolo = '~'; // água não alvejada
                    else
                        simbolo = (char) (v + '0'); // mostra ID real no modo debug
                } else {
                    int id = v - 10;
                    simbolo = (id == LIVRE ? '*' : 'X');
                }
                System.out.printf(" %2c", simbolo);
            }
            System.out.println();
        }
    }

    // ============================================================
    // POSICIONAMENTO DE NAVIOS
    // ============================================================
    static void posicionarNavios(int tipo, int qtd) {
        while (qtd > 0) {
            int x = rand.nextInt(TAM_MAT);
            int y = rand.nextInt(TAM_MAT);
            if (zonaDeGuerra[x][y] == LIVRE) {
                zonaDeGuerra[x][y] = tipo;
                qtd--;
            }
        }
    }

    static void posicionarTodosOsNavios() {
        posicionarNavios(PORTA_AVIOES, NUM_PORTA_AVIOES);
        posicionarNavios(FRAGATA, NUM_FRAGATAS);
        posicionarNavios(SUBMARINO, NUM_SUBMARINOS);
    }

    // ============================================================
    // MÉTODO TIRO()
    // ============================================================
    static int tiro() {
        System.out.println("\n--- TENTATIVA DE TIRO ---");
        // LER COORDENADAS COM PROTEÇÃO
        int x = lerInteiro("Digite a linha (0-9): ");
        int y = lerInteiro("Digite a coluna (0-9): ");
        
        if (posicaoValida(x, y)) {
            if (posicaoJaAlvejada(x, y)) {
                System.out.println("Essa posição já foi alvejada"); 
            }else{
                int id = zonaDeGuerra[x][y];
                atualizarPontuacao(id);
                
                zonaDeGuerra[x][y] = zonaDeGuerra[x][y] + 10; 
                if (zonaDeGuerra[x][y] > 10) {
                    System.out.println("Acertou!");
                }else{
                    System.out.println("Errou!");
                }
                contadorTiros++;
            }
        }else{
            System.out.println("Posição Inválida");
        }

        if (todosNaviosAtingidos()) {
            return VITORIA;
        }else if(contadorTiros == MAX_TIROS){
            return DERROTA;
        }else{
            return EM_ANDAMENTO;
        }
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
        posicionarTodosOsNavios();
        imprimeMatriz(); // no modo normal não revela navios
        int situacao;
        do {
            situacao = tiro();
            System.out.println("\nPontuação: " + pontuacao);
            System.out.println("Tiros restantes: " + (MAX_TIROS - contadorTiros));
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
        System.out.println("Sua pontuação foi: " + pontuacao);
    }
}

