package POO.iniciante.ex07;

import java.util.ArrayList;

public class App {
    private static ArrayList<Barco> barcos = new ArrayList<>();

    static void main() {
        Barco lancha = new Lancha("NX 270", 2023);
        Barco veleiro = new Veleiro("Catamarã", 2020);
        Barco jangada = new Jangada("Tronco", 1930);

        barcos.add(lancha);
        barcos.add(veleiro);
        barcos.add(jangada);

        for(Barco b : barcos){
            System.out.print(b);
            System.out.println();
        }

    }
}
