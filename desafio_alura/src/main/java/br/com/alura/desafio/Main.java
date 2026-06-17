package br.com.alura.desafio;

public class Main {
    public static void main(String[] args) {

        Podcast podcast = new Podcast();
        podcast.setTitulo("Flow");
        podcast.setHost("Igor 3k");
        podcast.setDescricao("Monark está de volta?");
        podcast.reproduzir();
        podcast.curtir();
        podcast.exibirInfo();
    }
}