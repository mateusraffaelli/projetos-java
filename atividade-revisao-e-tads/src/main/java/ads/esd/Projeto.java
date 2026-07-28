package ads.esd;

import java.util.ArrayList;

public class Projeto {
    private String nome;
    private Gerente gerente;
    private ArrayList<Funcionario> funcionarios;

    public Projeto(String nome, Gerente gerente, ArrayList<Funcionario> funcionarios) {
        this.nome = nome;
        this.gerente = gerente;
        this.funcionarios = funcionarios;
    }

    public void calcularSalario(boolean finalizado){
        gerente.setSalarioFinal(gerente.getSalarioBase()+ 0.01 * funcionarios.size());
        for(Funcionario f : funcionarios) {
            f.setSalarioFinal(f.getSalarioBase());
        }

        if (finalizado){
            gerente.setSalarioFinal(gerente.getSalarioFinal()*1.1);
            for(Funcionario f : funcionarios) {
                f.setSalarioFinal(f.getSalarioFinal()*1.1);
            }
        }
    }

    @Override
    public String toString() {
        return "Projeto: " + nome +
                "\nGerente: " + gerente +
                "\nSalário gerente: R$" + gerente.getSalarioFinal() +
                "\nLista de funcionários: " + funcionarios +
                "\nSalário dos funcionários: R$" + funcionarios +
                "\nCusto total: R$" + gerente.getSalarioFinal() + funcionarios.get(0).getSalarioFinal()*funcionarios.size();
    }
}
