package exemplo_heranca;

public class Supervisor extends Funcionario{
    private String codSupervisor;

    public Supervisor(String nome, double salario, String codSupervisor) {
        super(nome, salario);
        this.codSupervisor = codSupervisor;
    }

    public double calculaImposto() {
        return this.getSalario() * 0.0005;
    }
}
