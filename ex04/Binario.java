package ex04;

import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        double resultado;

        System.out.println("Digite os 5 bits de um número binario");
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt();
        n4 = leitor.nextInt();
        n5 = leitor.nextInt();
        resultado = (n1* Math.pow(2,4)) + (n2 * Math.pow(2,3)) + (n3* Math.pow(2, 2)) + (n4 * Math.pow(2,1)) + (n5 * Math.pow(2,0));
        System.out.println(resultado);


        leitor.close();
    }
    
}
