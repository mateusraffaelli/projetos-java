package POO.iniciante.ex08;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<FormaDePagamento> formaDePagamentos = new ArrayList<>();

    static void main() {
        Scanner scanner = new Scanner(System.in);
        double valor = 1000;
        int rsp;
        do {
            System.out.println(
                    "===================================" +
                    "\nValor: R$" + valor +
                    "\nSelecione sua forma de pagamento:" +
                    "\n1- PIX" +
                    "\n2- Boleto" +
                    "\n3- Cartão de Crédito" +
                    "\n4- Sair");

            rsp = scanner.nextInt();
            switch (rsp){
                case 1:
                    Pix pix = new Pix();
                    formaDePagamentos.add(pix);
                break;

                case 2:
                    System.out.println("Digite a data de pagamento: ");
                    LocalDate date = LocalDate.now();
                    Boleto boleto = new Boleto(date);
                    formaDePagamentos.add(boleto);
                break;

                case 3:
                    System.out.println("Digite o número de parcelas");
                    CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(scanner.nextInt());
                    formaDePagamentos.add(cartaoDeCredito);
                    break;

                case 4:
                    System.out.println("Fechando o programa");
                    break;

                default:
                    System.out.println("Número inválido");
                    break;
            }

            for (FormaDePagamento e : formaDePagamentos){
                System.out.println("Valor Final: " + e.calcularValor(valor));
                if (e instanceof CartaoDeCredito c){
                    System.out.println("Parcelas: " + c.getNumParcelas());
                }
            }
        }while (rsp != 4);
    }
}
