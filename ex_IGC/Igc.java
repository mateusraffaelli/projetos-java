package ex_IGC;

import java.util.Scanner;

public class Igc {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        
        int igc, icgMin, igcMax, igcNovo, meses;
        String sexo, faixaIdeal;
        boolean atleta, igcIdeal;

        System.out.println("Qual seu sexo?");
        sexo = leitor.next().toLowerCase();
        while (!(sexo.equals("homem") || sexo.equals("mulher"))){ // Garantindo que a resposta seja "homem" ou "mulher"
            System.out.println("Digite homem ou mulher");
            sexo = leitor.next().toLowerCase();
        }
        
        System.out.println("Qual o seu IGC?"); // IGC = Índice de gordura corporal (em %)
        igc = leitor.nextInt();

        System.out.println("Você é atleta? (true/false)");
        atleta = leitor.nextBoolean(); 

        
        if(atleta){
            if (sexo.equals("homem")) {
                icgMin = 6;
                igcMax = 14;
                faixaIdeal = "6% e 14%";
            } else{
                icgMin = 14;
                igcMax = 21;
                faixaIdeal = "14% e 21%";
            }
        } else {
            if (sexo.equals("homem")) {
                icgMin = 10;
                igcMax = 20;
                faixaIdeal = "10% e 20%";
            } else {
                icgMin = 18;
                igcMax = 28;
                faixaIdeal = "18% e 28%";
            }
        }

        igcIdeal = igc >= icgMin && igc <= igcMax;

            
        if (igcIdeal) {
            System.out.println(atleta ? "Seu IGC está na faixa esperada para um atleta" : "Você está saudável."); 
        }else{
            System.out.println(atleta ? "Seu IGC não está na faixa esperada para um atleta" : "Você não está saudável");
            System.out.println("A sua faixa de IGC ideal é entre " + faixaIdeal);

            System.out.println("Você deseja ficar saudável? (sim/não)");
            String resposta = leitor.next().toLowerCase();

            if (resposta.equals("sim")) { 
                System.out.println("Qual IGC você deseja alcançar?");
                igcNovo = leitor.nextInt();
                
                if (igcNovo >= icgMin && igcNovo <= igcMax) { // Verificando se igc está na faixa ideal
                    System.out.println("Em quantos meses você espera atingir esse índice?");
                    meses = leitor.nextInt();

                    if (meses > 0) {
                        double percentualMensal = (double)(igc - igcNovo)/meses;
                        System.out.println("Você deve perder cerca de " + percentualMensal + "% por mês");
                    }else{
                        System.out.println("Número de meses inválido");
                    }
                    
                }else {
                    System.out.println("Esse IGC não está na faixa ideal (" + faixaIdeal + ")");
                }
                
            }else{
                System.out.println("Fim");
            }
        }
            
        
        leitor.close();
    }
}
