package POO.iniciante.ex02;

public class Jangada extends Barco {
    public Jangada(String modelo, int anoDeFabricacao) {
        super(modelo, anoDeFabricacao);
    }

    @Override
    public String navegar() {
        return "Jangada navegando com os remos";
    }
}
