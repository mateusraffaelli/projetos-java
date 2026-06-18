package POO.iniciante.ex03;

public abstract class Midia {
    protected String titulo;
    private int duracaoSegundos;

    public Midia(String titulo, int duracaoSegundos) {
        this.titulo = titulo;
        this.duracaoSegundos = duracaoSegundos;
    }

    public abstract String reproduzir();

    public String exibirDuracao(){
        return String.format("%02d:%02d", duracaoSegundos / 60, duracaoSegundos % 60);
    }

    public String exibirMaisLonga(Midia m){
        if (this.duracaoSegundos > m.duracaoSegundos){
            return this.getClass().getSimpleName() + " é a mídia mais longa";
        }else if(m.duracaoSegundos > this.duracaoSegundos){
            return m.getClass().getSimpleName() + " é a mídia mais longa";
        }else {
            return "As duas mídias tem o mesmo tamanho";
        }
    }
}
