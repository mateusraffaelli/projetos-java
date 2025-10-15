package ex23;

import java.util.Scanner;

public class VerificacaoLoop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n;

        System.out.println("Digite um número");
        n = leitor.nextInt();
        while (n >= 0) {
            if (n % 2 == 0) {
                System.out.println("É par");
                if (n % 3 == 0) {
                    System.out.println("É múltiplo de 3");
                }if (n % 5 == 0) {
                    System.out.println("É múltiplo de 5");
                }if (n % 7 == 0) {
                    System.out.println("É múltiplo de 7");
                }
            }else{
                System.out.println("É ímpar");
            }
            System.out.println("Digite um número");
            n = leitor.nextInt();
            
        }

        leitor.close();
    }   
}
