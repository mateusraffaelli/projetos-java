package ex08;

import java.util.Scanner;

public class Especial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n;
        boolean nEspecial;

        System.out.println("Digite um número");
        n = leitor.nextInt();
        if (n % 2 == 0 || n % 3 == 0) {
            nEspecial = true;
        if (n % 10 == 0 || n % 6 == 0) {
            nEspecial = false;}
        } else {
            nEspecial = false;
        } 
        System.out.println(nEspecial); // True = é um número especial, False = não é um número especial    

        leitor.close();
    }
}
