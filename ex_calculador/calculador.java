

import java.util.Scanner;

public class calculador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean i = true;
        int n;
        double p1;
        double p2;
        double total;

       do{
        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Sair");
        n = leitor.nextInt();

        if(n == 5){
            System.out.println("Operação finalizada");
            i = false;
        }else 
        System.out.println("Entre com os parâmetros");
        p1 = leitor.nextDouble();
        p2 = leitor.nextDouble();
        switch (n) {
            case 1:
                total = p1 + p2;
                System.out.println(total);
                break;
            case 2:
                total = p1 - p2;
                System.out.println(total);
                break;
            case 3:
                total = p1 * p2;
                System.out.println(total);
                break;
            case 4:
                if (p2 == 0){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
                break;
            default:
                System.out.println("Você selecionou uma opção inválida");
                break;
        }
        
       }while( i = true);

       leitor.close();
    }
}
