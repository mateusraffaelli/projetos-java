package POO.iniciante.ex03;

public class App {
    static void main() {
        Midia musica = new Musica("Beat it", 200);
        Midia video = new Video("Clipe Beat it- Michael Jackson", 500);
        Midia podcast = new Podcast("O rei do Pop", 1000);

        System.out.println(musica.exibirDuracao());
        System.out.println(musica.reproduzir());
        System.out.println(video.exibirDuracao());
        System.out.println(video.reproduzir());
        System.out.println(podcast.exibirDuracao());
        System.out.println(podcast.reproduzir());

        System.out.println(musica.exibirMaisLonga(video));
    }
}
