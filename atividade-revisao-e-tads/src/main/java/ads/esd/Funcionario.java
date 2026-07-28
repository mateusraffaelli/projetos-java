package ads.esd;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private double salarioFinal;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.salarioFinal = salarioBase;
    }

    public void calcularSalario(boolean finalizado){
        salarioFinal = finalizado? salarioFinal*1.1 : salarioFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
}


