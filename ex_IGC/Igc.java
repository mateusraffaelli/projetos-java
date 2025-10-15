package ex_IGC;

import java.util.Scanner;

public class Igc {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String sexo;
        int igc;
        boolean igcIdeal;
        boolean atleta;
        String mensagem;
        int meses;

        System.out.println("Qual seu sexo?");
        sexo = leitor.next();
        while (!(sexo.equals("homem") || sexo.equals("mulher"))){ // Garantindo que a resposta seja "homem" ou "mulher"
            System.out.println("Digite homem ou mulher");
            sexo = leitor.next();
        }
        
        System.out.println("Qual o seu IGC?"); // IGC = Índice de gordura corporal (em %)
        igc = leitor.nextInt();
        System.out.println("Você é atelta?");
        atleta = leitor.nextBoolean(); // True = atleta, False = não atleta


        igcIdeal = igc >= 10; //Garantindo que a variavel seja iniciada
        mensagem = "10";
        if (atleta == false) {
            if (sexo.equals("homem")) {
                igcIdeal = igc >= 10 && igc <= 20;
                mensagem = "10% e 20%";
            } else if(sexo.equals("mulher")){
                igcIdeal = igc >= 18 && igc <= 28;
                mensagem = "18% e 28%";
            }
            
            if (igcIdeal == true) {
                System.out.println("Você está saudável.");
            }else if (igcIdeal == false){
                System.out.println("Você não está saudável.");
                System.out.println("A sua faixa de IGC deve ser entre " + mensagem);

                System.out.println("Você deseja ficar saudável?");
                mensagem = leitor.next();

                if (mensagem.equals("sim")) { 
                    System.out.println("Qual IGC você deseja alcançar?");
                    igc = leitor.nextInt();
                    
                    if (igcIdeal == true) { // Verificando se igc está na faixa ideal
                        System.out.println("Em quantos meses você espera atingir esse índice?");
                        meses = leitor.nextInt();
                        System.out.println("Você deve perder cerca de " + igc/meses + "% por mês");
                    }else if(igcIdeal == false){
                        System.out.println("Esse IGC não está na faixa ideal");
                    }
                    
                }else{
                    System.out.println("Fim");
                }
            }
            
        } else if(atleta == true){
            if (sexo.equals("homem")) {
                igcIdeal = igc >= 6 && igc <= 14;
                mensagem = "6% e 14%";
            } else if(sexo.equals("mulher")){
                igcIdeal = igc >= 14 && igc <= 21;
                mensagem = "14% e 21%";
            }

            if (igcIdeal == true) {
                System.out.println("Seu IGC está na faixa esperada para um atleta");
            }else if(igcIdeal == false){
                System.out.println("Seu IGC não está na faixa esperada.");
                System.out.println("A faixa de IGC esperada para atletas é entre " + mensagem);

                System.out.println("Você deseja atingir o IGC ideal?");
                mensagem = leitor.next();

                if (mensagem.equals("sim")) {
                    System.out.println("Qual IGC você deseja alcançar?");
                    igc = leitor.nextInt();

                    if (igcIdeal == true) {
                        System.out.println("Em quantos meses você espera atingir esse índice?");
                        meses = leitor.nextInt();
                        System.out.println("Você deve perder cerca de " + igc/meses + "% por mês");
                    }else if(igcIdeal == false){
                        System.out.println("Esse IGC não está na faixa ideal");
                    }

                }else{
                    System.out.println("Fim");
                }
            }
        }
        leitor.close();
    }
}
