package exemplo_equals;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculaImposto() { return this.salario; }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Funcionario comparavel;
        if (obj instanceof Funcionario) {
            comparavel = (Funcionario)obj;
        } else {
            return false;
        }

        if (comparavel.nome == this.nome && comparavel.salario == this.salario) {
            return true;
        }

        return false;
    }
}
