package faltar;

import java.util.Random;

public class Faltar {
    public static void main(String[] args) {
        System.out.println("Eu devo faltar hoje?");
        Random random = new Random();

        int numero = random.nextInt(2);
        System.out.println(numero);
        if (numero == 0) {
            System.out.println("Sim");
        }else {
            System.out.println("Não");
        }
    }
}
