package POO.iniciante.ex09;

public abstract class EquipamentoEsportivo implements Locavel{
    private int id;
    private String modelo;
    protected double valorDiaria;

    public EquipamentoEsportivo(int id, String modelo, double valorDiaria) {
        this.id = id;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public String exibirFicha(){
        return "ID: " + id + ", Modelo: " + modelo + ", Valor do Aluguel: " + valorDiaria;
    }
}
