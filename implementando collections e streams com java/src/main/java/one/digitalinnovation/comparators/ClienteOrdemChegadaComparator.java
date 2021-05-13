package one.digitalinnovation.comparators;

import java.util.Comparator;

public class ClienteOrdemChegadaComparator implements Comparator<Cliente> {

    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.getOrdemChegada() - o2.getOrdemChegada();
    }
}
