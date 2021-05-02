package exemplo_heranca;

public class Gerente extends Funcionario{
    private String codGerente;

    public Gerente(String nome, double salario, String codGerente) {
        super(nome, salario);
        this.codGerente = codGerente;
    }

    public double calculaImposto() {
        return this.getSalario() * 0.001;
    }
}
