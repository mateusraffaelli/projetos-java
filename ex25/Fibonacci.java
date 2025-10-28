package ex25;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        
        System.out.println("Digite o número de termos");
        n = sc.nextInt();
        
        double[] fibonacci = new double[n];
        fibonacci [0] = 1;
        fibonacci[1] = 1;
        System.out.println(fibonacci[0]);
        System.out.println(fibonacci[1]);
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
            System.out.println(fibonacci[i]);
        }

        
        sc.close();
    }
}
