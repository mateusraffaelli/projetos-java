package ex13;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Digite o valor de cada lado do triângulo");
        a = leitor.nextDouble();
        b = leitor.nextDouble();
        c = leitor.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && a == c) {
                System.out.println("Triângulo Equilátero");
            }if (a == b && a != c || a != b && a == c || b == c && b != a) {
                System.out.println("Triângulo Isóceles");
            }if (a != b && a != c && b != c) {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não forma um triângulo.");
        }

        leitor.close();
    }
}
