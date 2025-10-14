package ex22;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n;
        int nMultiplos;
        int multiplo = 0;

        System.out.println("Digite um número e quantos múltiplos você quer saber");
        n = leitor.nextInt();
        nMultiplos = leitor.nextInt();
        while (nMultiplos >= 0) {
            multiplo = n*nMultiplos;
            System.out.println(multiplo);
            nMultiplos--;
        }



        leitor.close();
    }
}
