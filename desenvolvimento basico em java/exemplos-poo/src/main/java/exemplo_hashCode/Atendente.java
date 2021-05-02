package exemplo_hashCode;

import java.util.Objects;

public class Atendente extends Funcionario {
    private String codAtendente;

    public Atendente(String nome, double salario, String codAtendente) {
        super(nome, salario);
        this.codAtendente = codAtendente;
    }

    public double calculaImposto() {
        return this.getSalario() * 0.0001;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Atendente comparavel;
        if (obj instanceof Atendente) {
            comparavel = (Atendente)obj;
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
        return Objects.hash(getNome(), getSalario(), codAtendente);
    }
}
