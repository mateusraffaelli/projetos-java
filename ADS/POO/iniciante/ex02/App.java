package POO.iniciante.ex02;

public class App {
    static void main() {
        Barco lancha = new Lancha("NX 270", 2023);
        Barco veleiro = new Veleiro("Catamarã", 2020);
        Barco jangada = new Jangada("Tronco", 1930);

        System.out.println(lancha);
        System.out.println(veleiro);
        System.out.println(jangada);
    }
}
