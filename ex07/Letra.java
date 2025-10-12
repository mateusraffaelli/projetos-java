package ex07;

import java.util.Scanner;

public class Letra {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String letra;
        boolean vogal;

        System.out.println("Escreva uma letra"); // A letra deve ser minuscula
        letra = leitor.nextLine();
        vogal = letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u");
        // USE .equals() ao invés de == 

        System.out.println(vogal); // True = a letra é vogal , False = a letra é consoante

        leitor.close();
    }
}
