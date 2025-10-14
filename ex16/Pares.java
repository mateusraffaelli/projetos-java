package ex16;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n;
        int impares; // soma dos números ímpares menores ou iguais a n

        System.out.println("Digite o valor de n"); 
        n = leitor.nextInt();

        if (n % 2 ==0) {
            impares = 0;
        }else{
            impares = n;
            n = n -1;
        }
        while (n > 0) {
            System.out.println(n);
            impares = impares + n - 1;
            n = n - 2;
        }
        System.out.println(n);
        System.out.println(impares);
        
        // Resultado: Todos os pares menores que n e a soma dos impares menores que n

        leitor.close();
    }
}
