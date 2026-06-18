package POO.iniciante.ex05;

public class App {
    static void main() {
        Usuario usuarioComum = new Usuario("Lucas", "lucas123");
        Administrador adm = new Administrador("adm", "adm123");

        System.out.println(usuarioComum.exibirMensagem());
        System.out.println(adm.exibirMensagem());
    }
}
