package POO.iniciante.ex01;

public class Bicicleta {
    private String marca;
    private int numMarchas;
    private double velAtual;

    public Bicicleta(String marca, int numMarchas) {
        this.marca = marca;
        this.numMarchas = numMarchas;
        this.velAtual = 0;
    }

    public void pedalar(double acrescimo){
        velAtual += acrescimo;
    }

    public void freiar(double decrescimo){
        velAtual -= decrescimo;
    }

    public double getVelAtual() {
        return velAtual;
    }
}
