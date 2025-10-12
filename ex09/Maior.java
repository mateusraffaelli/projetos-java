package ex09;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double n1;
        double n2; 
        double n3;

        System.out.println("Digite 3 números");
        n1 = leitor.nextDouble();
        n2 = leitor.nextDouble();
        n3 = leitor.nextDouble();

        // Vai escrever o maior
        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1);
        }else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2);
        }else if (n3 >= n1 && n3 >= n2) {
            System.out.println(n3);
        }else 
        

        leitor.close();
    }
}
