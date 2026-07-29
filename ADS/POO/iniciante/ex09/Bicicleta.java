package POO.iniciante.ex09;

public class Bicicleta extends EquipamentoEsportivo{
    private boolean eletrica;

    public Bicicleta(int id, String modelo, double valorDiaria, boolean eletrica) {
        super(id, modelo, valorDiaria);
        this.eletrica = eletrica;
    }

    @Override
    public double calcularValor(int numDias) {
        if (eletrica){
            return valorDiaria * numDias;
        }else {
            return valorDiaria * numDias/2;
        }
    }
}
