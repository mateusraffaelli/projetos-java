package ex19;

import java.util.Scanner;

public class Binario3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int bit;
        double decimal = 0;
        int i = 5;

        System.out.println("Digite os 5 bits de um número binario");
        while (i > 0) {
            i--;
            bit = leitor.nextInt();
            decimal = decimal + bit * Math.pow(2, i);
        }
        System.out.println(decimal);
        
        

        leitor.close();
    }
}
