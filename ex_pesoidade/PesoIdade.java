package ex_pesoidade;

import java.util.Scanner;

public class PesoIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int idadeInicial;
        int idade;
        double peso;
        int perfil;

        System.out.println("Digite sua idade e seu peso");
        idadeInicial = leitor.nextInt();
        peso = leitor.nextDouble();
        System.out.println("Qual seu perfil fisiológico?"); // 1 ou 2
        perfil = leitor.nextInt();
        idade = idadeInicial;
        while (!(idade >= (idadeInicial * 1.25) && peso % 3.0 == 0)) {
            peso = peso + perfil;
            idade = idade + 1;
        } 

        System.out.println(peso);
        System.out.println(idade);

        leitor.close();
    }
   
}
