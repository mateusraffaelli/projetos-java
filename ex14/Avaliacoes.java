package ex14;

import java.util.Scanner;

public class Avaliacoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int av1;
        int rec1;
        int av2;
        int rec2;
        int av3;    
        int rec3;
        int frequencia;
        double media;

        System.out.println("Digite a frequencia"); // Valor em porcentagem(0 a 100)
        frequencia = leitor.nextInt();
        if (frequencia < 75) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Digite a nota de cada avaliação seguida de sua recuperação"); // av1, rec1, av2 ...
            av1 = leitor.nextInt();
            rec1 = leitor.nextInt();
            av2 = leitor.nextInt();
            rec2 = leitor.nextInt();
            av3 = leitor.nextInt();
            rec3 = leitor.nextInt();
            
            if (rec1 > av1) {
                av1 = rec1;
            }if (rec2 > av2) {
                av2 = rec2;
            }if (rec3 > av3) {
                av3 = rec3;
            }
            media = (av1 + av2 + av3)/3; 
            System.out.println("Sua média é " + media);
            if (media >= 6) {
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
        }

        leitor.close();
    }

    
}
