package jogos;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuar = true;

        do{
            int numeroAleatorio = random.nextInt(3) + 1;
            System.out.println("");
            System.out.println("=== PEDRA, PAPEL OU TESOURA ===");
            System.out.println("Escolha pedra, papel ou tesoura");
            String escolhaJogador = scanner.nextLine();

            String escolhaComputador = "";

            if (numeroAleatorio == 1) {
                escolhaComputador = "pedra";
            } else if (numeroAleatorio == 2) {
                escolhaComputador = "papel";
            }else {
                escolhaComputador = "tesoura";
            }

            System.out.println("");
            System.out.println("Você escolheu: " + escolhaJogador);
            System.out.println("O computador escolheu: " + escolhaComputador);

            if (escolhaJogador.equalsIgnoreCase(escolhaComputador)) {
                System.out.println("Empatou!");
            }else{
                if (escolhaJogador.equalsIgnoreCase("pedra")) {
                    escolhaComputador = numeroAleatorio == 2? "O computador venceu!" : "Você venceu!";
                } else if (escolhaJogador.equalsIgnoreCase("papel")){
                    escolhaComputador = numeroAleatorio == 3? "O computador venceu!" : "Você venceu!";
                }else if (escolhaJogador.equalsIgnoreCase("tesoura")){
                    escolhaComputador = numeroAleatorio == 1? "O computador venceu!" : "Você venceu!";
                }else{
                    System.out.println("Opção Inválida");
                    return;
                }
            }

            System.out.println(escolhaComputador);
            System.out.println("");
            System.out.println("Você quer jogar novamente? (sim/não)");
            String jogarNovamente = scanner.nextLine();

            if (!(jogarNovamente.equalsIgnoreCase("sim"))) {
                continuar = false;
            }

        }while(continuar);

        System.out.println("");
        scanner.close();

    }
}
