package POO.iniciante.ex07;

public abstract class Barco {
    private static int contador = 0;
    private int id;
    private String modelo;
    private int anoDeFabricacao;

    public Barco(String modelo, int anoDeFabricacao) {
        contador++;
        this.id = contador;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public abstract String navegar() ;

    @Override
    public String toString() {
        return  getClass().getSimpleName() +
                ": {id=" + id +
                ", modelo='" + modelo + '\'' +
                ", anoDeFabricacao=" + anoDeFabricacao +
                "}";
    }
}
