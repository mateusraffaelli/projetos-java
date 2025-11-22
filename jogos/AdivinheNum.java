package jogos;
import java.util.Random;
import java.util.Scanner;

public class AdivinheNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("");
        System.out.println("=== JOGO DO NÚMERO ALEATÓRIO ===");
        System.out.println("Escolha o nível de dificuldade:");
        System.out.println("1. Fácil (1-50)");
        System.out.println("2. Médio (1-100)");
        System.out.println("3. Difícil (1-500)");
        System.out.println("4. Impossível (1-1000)");
        int dificuldade = scanner.nextInt();

        int numeroAleatorio;
        int numMax;

        switch (dificuldade) {
            case 1:
                numMax = 50;
                numeroAleatorio = random.nextInt(50) + 1;
                break;
            
            case 2:
                numMax = 100;
                numeroAleatorio = random.nextInt(100) + 1;
                break;
                
            case 3:
                numMax = 500;
                numeroAleatorio = random.nextInt(500) + 1;
                break;

            case 4:
                numMax = 1000;
                numeroAleatorio = random.nextInt(1000) + 1;
                break;
        
            default:
                System.out.println("Opção Inválida");
                return;
        }

        System.out.println("Escolha um número inteiro de 1 a " + numMax);
        int tentativa = scanner.nextInt();
        
        int numTentativas = 1;

        while (tentativa != numeroAleatorio) {
             if (tentativa < 1 || tentativa > numMax) {
                System.out.println("Número inválido.");
            }else{
                if (tentativa > numeroAleatorio) {
                    System.out.println("O número é MENOR");
                } else {
                    System.out.println("O número é MAIOR");
                }
            }
            numTentativas++;

            tentativa = scanner.nextInt();
        }

        System.out.println("");
        if (numTentativas == 1) {
            System.out.println("Uau! Parabéns, você acertou o número de primeira");
        }else{
            System.out.println("Parabéns! Você acertou o número aleatório.");
            System.out.println("Você acertou em " + numTentativas + " tentativas"); 
        }
       
        System.out.println("");
        scanner.close();
    }  
}
