package ex11;

import java.util.Scanner;

public class Sensor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String senha;
        boolean sensor; // sensor de porta aberta

        System.out.println("Qual o estado da porta?"); // True = porta aberta , False = porta fechada
        sensor = leitor.nextBoolean(); 
        if (sensor == true) {
            System.out.println("A porta já está aberta.");
        } else {
            System.out.println("Acionando a abertura da porta.");
            System.out.println("Digite a senha:");
            senha = leitor.next();
            if (senha.equals("alfa")) {
                System.out.println("Acesso permitido");
            } else {
                System.out.println("Acesso negado");
            }
        }
        

        leitor.close();
    }
}
