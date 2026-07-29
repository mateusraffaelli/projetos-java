package POO.iniciante.ex04;

public class CartaoDeCredito implements FormaDePagamento{
    private int numParcelas;
    private double juros;

    public CartaoDeCredito(int numParcelas) {
        this.numParcelas = numParcelas;
        if (numParcelas >= 6 && numParcelas < 12){
            juros = 100;
        }else if(numParcelas >= 12){
            juros = 200;
        }else {
            this.juros = 0;
        }
    }

    @Override
    public double calcularValor(double valorInicial) {
        return valorInicial*numParcelas + juros;
    }
}
