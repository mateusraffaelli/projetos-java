package ex11;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String senha;

        System.out.println("Escreva a senha");
        senha = leitor.next();
        if (senha.equals("alfa")) {
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }

        leitor.close();
    }
}
