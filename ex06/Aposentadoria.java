package ex06;

import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a idade e o tempo de serviço");
        int idade = leitor.nextInt(); 
        int tempo = leitor.nextInt();
        boolean aposentar;

        if (idade >= 65 || tempo >= 30 || idade >= 60 && tempo >= 25) {
            aposentar = true;
        } else {
            aposentar = false;
        }

        System.out.println(aposentar); // True = pode se aposentar, False = não pode

        leitor.close();
    }
}
