package ex04;

import java.util.Scanner;

public class Binario2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int bit;
        double decimal;

        System.out.println("Digite os 5 bits de um número binario");
        bit = leitor.nextInt();
        decimal = bit * Math.pow(2,4);
        bit = leitor.nextInt();
        decimal = decimal + bit * Math.pow(2, 3);
        bit = leitor.nextInt();
        decimal = decimal + bit * Math.pow(2,2);
        bit = leitor.nextInt();
        decimal = decimal + bit * Math.pow(2,1);
        bit = leitor.nextInt();
        decimal = decimal + bit * Math.pow(2,0);
        System.out.println(decimal);
        


        leitor.close();
    }
}
