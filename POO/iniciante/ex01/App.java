package POO.iniciante.ex01;

public class App {
    static void main() {
        BicicletaEletrica bicicletaEletrica = new BicicletaEletrica("Caloi", 10 );

        bicicletaEletrica.pedalar(5);
        bicicletaEletrica.freiar(10);
        bicicletaEletrica.modoTurbo(15);

        System.out.println(bicicletaEletrica.getVelAtual() + " KM/h");
        System.out.println(bicicletaEletrica.getNivelBateria() + "%");

    }
}
