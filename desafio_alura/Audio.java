package desafio_alura;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        curtidas++;
    }

    public void reproduzir(){
        totalDeReproducoes++;
    }

    public void exibirInfo(){
        System.out.println("Título: " + titulo +
                "\nDuração: " + duracao +
                "\nTotal de reproduções: " + totalDeReproducoes +
                "\nCurtidas: " + curtidas +
                "\nClassificação: " + classificacao);
    }
}
