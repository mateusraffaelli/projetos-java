package ads.esd;

import java.util.ArrayList;import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario("Julio", 1000);
        Funcionario funcionario2 = new Funcionario("Lucas", 1100);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

        Gerente gerente = new Gerente("Notch", 5000, funcionarios.size());

        Projeto projeto = new Projeto("Minecraft Java", gerente, funcionarios);
        System.out.println("O projeto está finalizado?");
        
        System.out.println(projeto);

        scanner.close();

    }
}
