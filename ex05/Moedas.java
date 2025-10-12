package ex05;

import java.util.Scanner;

public class Moedas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int cent;
        int resto;
        int cinquenta;
        int vinteCinco;
        int dez;
        int cinco;
        int um;
      
        
        System.out.println("Escreva o valor em centavos");
        cent = leitor.nextInt();
        cinquenta = cent / 50;
        resto = cent - cinquenta * 50;
        vinteCinco = resto / 25;
        resto = resto - vinteCinco * 25;
        dez = resto / 10;
        resto = resto - dez * 10;
        cinco = resto / 5;
        resto = resto - cinco * 5;
        um = resto / 1;
        System.out.println(cinquenta + " " + vinteCinco + " " + dez + " " + cinco + " " + um);
        leitor.close();
    }
}
