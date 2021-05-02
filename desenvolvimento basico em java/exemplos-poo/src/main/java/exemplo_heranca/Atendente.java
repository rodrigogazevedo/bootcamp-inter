package exemplo_heranca;

public class Atendente extends Funcionario{
    private String codAtendente;

    public Atendente(String nome, double salario, String codAtendente) {
        super(nome, salario);
        this.codAtendente = codAtendente;
    }

    public double calculaImposto() {
        return this.getSalario() * 0.0001;
    }
}
