package ex19;

import java.util.Scanner;

public class Binario4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int bit;
        double decimal = 0;
        int n;

        System.out.println("Digite quantos bits terá o binário");
        n = leitor.nextInt();
        System.out.println("Digite os " + n + " bits"); // Do mais significativo para o menos significativo
        while (n > 0) {
            n--;
            bit = leitor.nextInt();
            decimal = decimal + bit * Math.pow(2, n);
        }
        System.out.println(decimal);
        
        
        leitor.close();
    }
}
