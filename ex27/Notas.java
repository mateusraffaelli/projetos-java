package ex27;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[38];
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota, restam " + (notas.length - i) + " notas");
            notas[i] = sc.nextDouble();
            media = media + notas[i];
        }
        media = media/notas.length;
        System.out.println("A média da turma é: " + media);

        sc.close();
    }
}
