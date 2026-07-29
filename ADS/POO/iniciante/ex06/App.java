package POO.iniciante.ex06;

import java.util.ArrayList;

public class App {
    static void main() {
        Camera camera = new Smartphone();
        Telefone telefone = new Smartphone();

        System.out.println(camera.gravarVideo());
        System.out.println(camera.tirarFoto());
        System.out.println(telefone.atender());
        System.out.println(telefone.ligar());

    }
}
