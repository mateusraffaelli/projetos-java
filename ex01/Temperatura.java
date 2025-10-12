package ex01;

import java.util.Scanner;
public class Temperatura {        
		public static void main(String[] args) throws Exception{        
				Scanner leitor = new Scanner(System.in);
        double tempC;        
        double tempF;
        System.out.println("Digite a temperatura em Fahrenheit");        
        tempF = leitor.nextDouble();        
        tempC = (tempF - 32) * 5/9;        
        System.out.println(tempC);
        leitor.close();
    }


}