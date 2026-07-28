package ads.esd;

public class Gerente extends Funcionario{
    private int numFuncionarios;

    public Gerente(String nome, double salarioBase, int numFuncionarios) {
        super(nome, salarioBase);
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public void calcularSalario(boolean finalizado) {
        this.setSalarioFinal(this.getSalarioBase() * 1+(numFuncionarios * 0.01));
        super.calcularSalario(finalizado);
    }
}
