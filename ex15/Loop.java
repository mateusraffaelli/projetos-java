package ex15;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int i;
        int n;

        System.out.println("Digite o valor de n");
        n = leitor.nextInt();
        i = 1;
        while (i < n){
            i = i *2;
        }
        System.out.println(i);

        leitor.close();
    }
}
