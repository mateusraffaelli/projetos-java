package ads.esd.testes;

import ads.esd.VetorDeListas;
import ads.esd.VetorEstatico;

public class ex05 {
    public static void main(String[] args) {
        VetorDeListas vetor = new VetorDeListas();
        vetor.inserir("Daniel");
        vetor.inserir("Danilo");
        vetor.inserir("Dante");
        vetor.inserir("Gabriel");
        vetor.inserir("Gustavo");
        vetor.inserir("Walter");
        vetor.imprimir();
    }
}
