package POO.iniciante.ex03;

public class Musica extends Midia {
    public Musica(String titulo, int duracaoSegundos) {
        super(titulo, duracaoSegundos);
    }

    @Override
    public String reproduzir() {
        return "Música `" + super.titulo +"` tocando";
    }
}
