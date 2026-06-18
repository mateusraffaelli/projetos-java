package POO.iniciante.ex04;

public class Pix implements FormaDePagamento {
    private final double DESCONTO;

    public Pix() {
        this.DESCONTO = 0.05;
    }

    @Override
    public double calcularValor(double valorInicial) {
        return valorInicial - valorInicial*DESCONTO;
    }
}
