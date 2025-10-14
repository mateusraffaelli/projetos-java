package ex17;

import java.util.Scanner;

public class SenhaCorreta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String senha;
        boolean sensor; // sensor de porta aberta
        int i = 5;

        System.out.println("Qual o estado da porta?"); // True = porta aberta , False = porta fechada
        sensor = leitor.nextBoolean();
        if (sensor == true) {
            System.out.println("A porta já está aberta.");
        } else {
            System.out.println("Acionando a abertura da porta.");
            while (i >= 0) {
                System.out.println("Digite a senha:");
                senha = leitor.next();
                if (senha.equals("alfa")) {
                    System.out.println("Acesso permitido");
                    break;
                } else {
                    System.out.println("Acesso negado");
                    i--;
                    if (i > 1) {
                        System.out.println("Restam " + i + " tentativas");
                    }if (i == 1) {
                        System.out.println("Última tentativa");
                    }if(i == 0){
                        System.out.println("Sistema bloqueado");
                        break;
                    }
                }
            }
            
        }
        

        leitor.close();
    }
}
