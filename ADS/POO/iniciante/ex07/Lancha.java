package POO.iniciante.ex07;

public class Lancha extends Barco {
    public Lancha(String modelo, int anoDeFabricacao) {
        super(modelo, anoDeFabricacao);
    }

    @Override
    public String navegar() {
        return "Lancha navegando com um motor";
    }
}
