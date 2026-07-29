package POO.iniciante.ex03;

public class Podcast extends  Midia{
    public Podcast(String titulo, int duracaoSegundos) {
        super(titulo, duracaoSegundos);
    }

    @Override
    public String reproduzir() {
        return "Podcast `" + super.titulo + "` sendo reproduzido";
    }
}
