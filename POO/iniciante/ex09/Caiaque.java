package POO.iniciante.ex09;

public class Caiaque extends EquipamentoEsportivo{
    public Caiaque(int id, String modelo, double valorDiaria) {
        super(id, modelo, valorDiaria);
    }

    @Override
    public double calcularValor(int numDias) {
        return 0;
    }
}
