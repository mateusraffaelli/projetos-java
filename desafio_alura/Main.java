package desafio_alura;

public class Main {
    public static void main(String[] args) {

        Podcast podcast = new Podcast();
        podcast.setTitulo("Flow");
        podcast.setHost("Igor 3k");
        podcast.setDescricao("Monark está de volta?");
        podcast.reproduzir();
        podcast.curtir();
        podcast.exibirInfo();
        System.out.println();

        Musica musica = new Musica();
        musica.setTitulo("Forever");
        musica.setArtista("Kiss");
        musica.setAlbum("Hot in the shade");
        musica.setGenero("Rock");
        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }
        for (int i = 0; i < 200; i++) {
            musica.curtir();
        }
        musica.exibirInfo();
        System.out.println();

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incui(podcast);
        preferidas.incui(musica);
    }
}