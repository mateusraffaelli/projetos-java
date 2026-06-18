package POO.iniciante.ex05;

public class Usuario implements Autentificavel{
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.senha = senha;
        this.nome = nome;
    }

    public String exibirMensagem() {
        return "Olá " + nome + ", seja Bem Vindo!";
    }

    @Override
    public boolean autentificar(String nome, String senha) {
        return this.nome.equals(nome) && this.senha.equals(senha);
    }
}
