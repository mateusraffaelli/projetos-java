package ex12;

import java.util.Scanner;

public class Conjuntos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n1;
        int n2;
        int n3; 
        int n4;
        int x;
        boolean conjA;
        boolean conjB;

        System.out.println("Digite os valores de n1, n2, n3, n4 e  x");
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt(); 
        n4 = leitor.nextInt();
        x = leitor.nextInt();
        conjA = x >= n1 && x <= n2;
        conjB = x >= n3 && x <= n4;
        if (conjA == true && conjB == false) {
            System.out.println("x pertence somente ao conjunto A");
        }if (conjB == true && conjA == false) {
            System.out.println("x pertence somente ao conjunto B");
        }if (conjA == true && conjB == true) {
            System.out.println("x pertence a ambos os conjuntos");
        }else if(conjA == false && conjB == false){
            System.out.println("x não pertence a nenhum conjunto");
        }
        leitor.close();
    }
}
