package ex18;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n;
        double x;
        int i = 0;
        double media = 0;

        System.out.println("Escreva n");
        n = leitor.nextInt();
        while (n > 0) {
            System.out.println("Digite " + n + " números");
            x = leitor.nextDouble();
            if (x > 5 && x < 10) {
                media = media + x;
                i++;
            }
            n--;
        }
        media = media/i;
        System.out.println(media);

        leitor.close();
    }
}
