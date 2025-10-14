import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double pi = Math.PI;
      
        System.out.println("Escolha uma das opções:");
        System.out.println("1.Área de um retângulo");
        System.out.println("2.Área de um triângulo");
        System.out.println("3.Hipotenusa de um triângulo retângulo");
        System.out.println("4.Área de um círculo");
        System.out.println("5.Perímetro de um círculo");
        System.out.println("6.Média de n números de ponto flutuante");

        int n = leitor.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("Entre com os dois lados do retângulo");
                double a = leitor.nextDouble();
                double b = leitor.nextDouble();
                if (a >= 1 && b >= 1) {
                    if (a != b) {
                        double areaRet = a * b;
                        System.out.println(areaRet);
                    }else{
                        System.out.println("Isso é um quadrado");
                    }      
                }else {
                   System.out.println("O retângulo não existe");
                }
                
                break;
            case 2:
                System.out.println("Entre com os dois lados do triângulo");
                double base = leitor.nextDouble();
                double altura = leitor.nextDouble();
                if (base >= 1 && altura >= 1) {
                    double areaTri = base * altura/2;
                    System.out.println(areaTri);
                }else {
                   System.out.println("O triângulo não existe");
                }
                
                break;
            case 3:
                System.out.println("Entre com os catetos de um triângulo retângulo");
                int cat1 = leitor.nextInt();
                int cat2 = leitor.nextInt();
                if (cat1 >= 1 && cat2 >= 1) {
                    double hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
                    System.out.println(hip);
                } else {
                    System.out.println("O triângulo não existe");
                }
                
                break;
            case 4:
                System.out.println("Entre com o raio do círculo");
                double raio1 = leitor.nextDouble();
                if (raio1 >= 1) {
                    double areaCic = Math.pow(raio1,2) * pi;
                    System.out.println(areaCic);
                } else {
                    System.out.println("O cículo não existe");
                }
                
                break;
            case 5:
                System.out.println("Entre com o raio do círculo");
                double raio2 = leitor.nextDouble();
                if (raio2 >= 1) {
                    double perimetro = 2*raio2*pi;
                    System.out.println(perimetro);
                } else {
                    System.out.println("O cículo não existe");
                }
                break;
            case 6:
                System.out.println("Entre com três números");
                double num1 = leitor.nextDouble() ;
                double num2 = leitor.nextDouble();
                double num3 = leitor.nextDouble();
                double media = (num1 + num2 + num3)/3;
                System.out.println(media);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        
        leitor.close();

    }
}
