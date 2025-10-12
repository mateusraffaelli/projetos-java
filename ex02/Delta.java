package ex02;

import java.util.Scanner;


public class Delta {        
        public static void main(String[] args) {        
        Scanner leitor = new Scanner(System.in);
        
        double a;        
        double b;        
        double c;        
        double delta;
        System.out.println("Digite a");        
        a = leitor.nextDouble();        
        System.out.println("Digite b");        
        b = leitor.nextDouble();        
        System.out.println("Digite c");        
        c = leitor.nextDouble();        
        delta = b*b - 4*a*c;        
        System.out.println(delta);        

        leitor.close();

    }

}

