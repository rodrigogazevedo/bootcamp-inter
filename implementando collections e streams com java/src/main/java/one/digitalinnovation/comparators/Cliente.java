package one.digitalinnovation.comparators;

public class Cliente implements Comparable<Cliente>{

    public final String nome;
    public final Integer ordemChegada;

    public Cliente(String nome, Integer ordemChegada) {
        this.nome = nome;
        this.ordemChegada = ordemChegada;
    }

    public String getNome() {
        return nome;
    }

    public Integer getOrdemChegada() {
        return ordemChegada;
    }

    @Override
    public String toString() {
        return nome + " - " + ordemChegada;
    }

    @Override
    public int compareTo(Cliente o) {
        return this.getOrdemChegada() - o.getOrdemChegada();
    }
}
