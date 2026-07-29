package POO.iniciante.ex04;

import java.time.LocalDate;

public class Boleto implements FormaDePagamento{
    private final double MULTA ;
    private LocalDate data;

    public Boleto(LocalDate data) {
        this.data = data;
        this.MULTA = 100;
    }

    @Override
    public double calcularValor(double valorInicial) {
        if (data.isAfter(LocalDate.now())){
            return valorInicial + MULTA;
        }else {
            return valorInicial;
        }
    }
}
