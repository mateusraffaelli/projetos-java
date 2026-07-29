package POO.iniciante.ex02;

public class Veleiro extends Barco{
    public Veleiro(String modelo, int anoDeFabricacao) {
        super(modelo, anoDeFabricacao);
    }

    @Override
    public String navegar() {
        return "Veleiro navegando com o vento e as velas";
    }
}
