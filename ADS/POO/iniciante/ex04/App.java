package POO.iniciante.ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double valor = 1000;
        System.out.println(
                "===================================" +
                "\nValor: R$" + valor +
                "\nSelecione sua forma de pagamento:" +
                "\n1- PIX" +
                "\n2- Boleto" +
                "\n3- Cartão de Crédito");

        int rsp = scanner.nextInt();
        switch (rsp){
            case 1:
                Pix pix = new Pix();
                System.out.println(pix.calcularValor(valor));
            break;

            case 2:
                System.out.println("Digite a data de pagamento: ");
                LocalDate date = LocalDate.now();
                Boleto boleto = new Boleto(date);
                System.out.println(boleto.calcularValor(valor));
            break;

            case 3:
                System.out.println("Digite o número de parcelas");
                CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(scanner.nextInt());
                System.out.println(cartaoDeCredito.calcularValor(valor));
        }
    }
}
