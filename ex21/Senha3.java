package ex21;

import java.util.Scanner;

public class Senha3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String senha = "corinthans";
        String resposta;
        

        for(int i = 3; i>0; i--){
            System.out.println("Digite a senha:");
            resposta = leitor.next();
            if (resposta.equals(senha)) {
                System.out.println("Você acertou!");
                break;
            }else{
                System.out.println("Você errou!");
            }
        }
        
        leitor.close();
    }
}
