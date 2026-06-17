package desafio_alura;

public class MinhasPreferidas {
    public void incui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto" );
        }else {
            System.out.println(audio.getTitulo() + " todo mundo está curtindo");
        }
    }
}
