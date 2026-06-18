package POO.iniciante.ex03;

public class Video extends Midia{
    public Video(String titulo, int duracaoSegundos) {
        super(titulo, duracaoSegundos);
    }

    @Override
    public String reproduzir() {
        return "Vídeo `" + super.titulo + "` sendo reproduzido";
    }
}
