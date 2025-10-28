package ex24;

import java.util.Scanner;

public class ArrayMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] n1 = new double[10];
        double maior = n1[0]; //Maior elemento

        for (int i = 0; i < n1.length; i++) {
            System.out.println("Digite o termo, restam " + (n1.length-i) + " termos");
            n1[i] = sc.nextDouble();
            if (n1[i] > maior) {
                maior = n1[i];
            }
        }

        System.out.println("O maior número é: " + maior);

        sc.close();
    }

}
