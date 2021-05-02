package exemplo_equals;

public class Supervisor extends Funcionario {
    private String codSupervisor;

    public Supervisor(String nome, double salario, String codSupervisor) {
        super(nome, salario);
        this.codSupervisor = codSupervisor;
    }

    public double calculaImposto() {
        return this.getSalario() * 0.0005;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Supervisor comparavel;
        if (obj instanceof Supervisor) {
            comparavel = (Supervisor)obj;
        } else {
            return false;
        }

        if (comparavel.getNome() == this.getNome() && comparavel.getSalario() == this.getSalario() && comparavel.codSupervisor == this.codSupervisor) {
            return true;
        }

        return false;
    }
}
