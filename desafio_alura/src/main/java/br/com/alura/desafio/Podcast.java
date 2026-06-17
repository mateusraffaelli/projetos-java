package br.com.alura.desafio;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Host: " + host +
                            "\nDescrição: " + descricao);
    }
}
