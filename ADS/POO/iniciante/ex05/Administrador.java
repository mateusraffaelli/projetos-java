package POO.iniciante.ex05;

public class Administrador extends  Usuario{
    public Administrador(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public String exibirMensagem() {
        return super.exibirMensagem() + " (Perfil ADM)";
    }
}
