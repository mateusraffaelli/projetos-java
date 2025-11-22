import java.util.Random;
import java.util.Scanner;

public class AdivinheNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        System.out.println(numeroAleatorio);
        
        System.out.println("");
        System.out.println("=== JOGO DO NÚMERO ALEATÓRIO ===");
        System.out.println("Escolha um número inteiro de 1 a 100:");
        int tentativa = scanner.nextInt();
        
        int numTentativas = 1;

        while (tentativa != numeroAleatorio) {
             if (tentativa < 1 || tentativa > 100) {
                System.out.println("Número inválido.");
            }else{
                if (tentativa > numeroAleatorio) {
                    System.out.println("O número é MENOR");
                } else {
                    System.out.println("O número é MAIOR");
                }
            }
            numTentativas++;

            System.out.println("Digite um número:");
            tentativa = scanner.nextInt();
        }

        System.out.println("");
        if (numTentativas == 1) {
            System.out.println("Uau! Parabéns, você acertou o número de primeira");
        }else{
            System.out.println("Parabéns! Você acertou o número aleatório.");
            System.out.println("Você acertou com " + numTentativas + " tentativas"); 
        }
       
        System.out.println("");
        scanner.close();
    }  
}
