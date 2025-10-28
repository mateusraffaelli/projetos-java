package ex26;

import java.util.Scanner;

public class ArraySoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] n1 = new double[5];
        double[] n2 = new double[5];
        double[] soma = new double[5];

        System.out.println("Digite um termo do array (0 a 4)");
        int n = sc.nextInt();

        System.out.println("Digite o termo de cada vetor");
        n1[n] = sc.nextDouble();
        n2[n] = sc.nextDouble();
        soma[n] = n1[n] + n2[n];
        System.out.println(soma[n]);

        sc.close();
    }
}
