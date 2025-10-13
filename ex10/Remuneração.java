package ex10;

import java.util.Scanner;

public class Remuneração {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double remuneracao = 2000;
        double comissao;
        double vendasTotal;
        double desempenho;

        System.out.println("Digite o valor total de vendas e a avaliação do desempenho do vendedor");
        vendasTotal = leitor.nextDouble();
        desempenho = leitor.nextDouble(); // De 0 a 10
        if (desempenho >= 8) {
            remuneracao = remuneracao + 500;
        }if (vendasTotal > 10000) {
            comissao = 0.07 * vendasTotal;
        }else{
            comissao = 0.05 * vendasTotal;
        }
        
        remuneracao = remuneracao + comissao;
        System.out.println(remuneracao);

        leitor.close();
    }
}
