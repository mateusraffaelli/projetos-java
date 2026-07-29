package POO.iniciante.ex09;

public class Tenda extends EquipamentoEsportivo{
    private int capacidadeMax;

    public Tenda(int id, String modelo, double valorDiaria, int capacidadeMax) {
        super(id, modelo, valorDiaria);
    }

    @Override
    public double calcularValor(int numDias) {
        if (numDias > 7 && numDias < 14){
            return valorDiaria * numDias/2;
        } else if (numDias >= 14) {
            return valorDiaria * numDias/3;
        }else {
            return valorDiaria * numDias;
        }
    }
}
