package exemplo_hashCode;

import java.util.Objects;

public class Gerente extends Funcionario {
    private String codGerente;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public Gerente(String nome, double salario, String codGerente) {
        super(nome, salario);
        this.codGerente = codGerente;
    }

    public double calculaImposto() {
        return this.getSalario() * 0.001;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Gerente comparavel;
        if (obj instanceof Gerente) {
            comparavel = (Gerente)obj;
        } else {
            return false;
        }

        if (this.hashCode() == obj.hashCode()) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSalario(), codGerente);
    }
}
