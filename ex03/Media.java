package ex03;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
		
        double nota;        
        double media;
        
        System.out.println("Digite nota1");        
        nota = leitor.nextDouble();        
        media = nota;        
        System.out.println("Digite nota2");        
        nota = leitor.nextDouble();        
        media = media + nota;         
        System.out.println("Digite nota3");        
        nota = leitor.nextDouble();        
        media = media + nota;        
        System.out.println("Digite nota4");        
        nota = leitor.nextDouble();        
        media = (media + nota)/4;        
        System.out.println(media);



        leitor.close();
    }
}
