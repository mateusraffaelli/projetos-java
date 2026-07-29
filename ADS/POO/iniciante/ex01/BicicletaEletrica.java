package POO.iniciante.ex01;

public class BicicletaEletrica extends Bicicleta{
    private int nivelBateria;

    public BicicletaEletrica(String marca, int numMarchas) {
        super(marca, numMarchas);
        this.nivelBateria = 100;
    }

    @Override
    public void pedalar(double acrescimo) {
        super.pedalar(acrescimo);
        nivelBateria -= acrescimo * 0.5;
    }

    public void modoTurbo(double acrescimo){
        super.pedalar(acrescimo);
        nivelBateria -= acrescimo;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }
}
