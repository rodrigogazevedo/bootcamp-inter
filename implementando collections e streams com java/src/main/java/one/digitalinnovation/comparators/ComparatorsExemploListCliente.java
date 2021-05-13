package one.digitalinnovation.comparators;

import java.util.*;

public class ComparatorsExemploListCliente {

    public static void main(String[] args) {

        System.out.println("---------- List ----------");
        OrdenaList();
        System.out.println("\n---------- TreeSet ----------");
        OrdenaTreeSet();
    }

    public static void AdicionaList(List ordemDeChegada) {
        if (!ordemDeChegada.isEmpty()) {
            ordemDeChegada.clear();
        }

        ordemDeChegada.add(new Cliente("Pedro", 2));
        ordemDeChegada.add(new Cliente("Juliana", 6));
        ordemDeChegada.add(new Cliente("Felipe", 5));
        ordemDeChegada.add(new Cliente("Arthur", 3));
        ordemDeChegada.add(new Cliente("Letícia", 4));
        ordemDeChegada.add(new Cliente("Marcos", 1));
    }

    public static void AdicionaTreeSet(TreeSet ordemDeChegada) {
        if (!ordemDeChegada.isEmpty()) {
            ordemDeChegada.clear();
        }

        ordemDeChegada.add(new Cliente("Pedro", 2));
        ordemDeChegada.add(new Cliente("Juliana", 6));
        ordemDeChegada.add(new Cliente("Felipe", 5));
        ordemDeChegada.add(new Cliente("Arthur", 3));
        ordemDeChegada.add(new Cliente("Letícia", 4));
        ordemDeChegada.add(new Cliente("Marcos", 1));
    }

    public static void OrdenaList() {
        List<Cliente> ordemDeChegada = new ArrayList<>();

        AdicionaList(ordemDeChegada);

        System.out.println(ordemDeChegada);

        Collections.sort(ordemDeChegada, new ClienteOrdemChegadaComparator());

        System.out.println("--- ordem reversa dos números - idade (interface Comparator) ---");
        System.out.println(ordemDeChegada);

        AdicionaList(ordemDeChegada);

        Collections.sort(ordemDeChegada);

        System.out.println("--- ordem natural dos números - ordem de chegada (interface Comparable) ---");
        System.out.println(ordemDeChegada);

        AdicionaList(ordemDeChegada);

        ordemDeChegada.sort((primeiro, segundo) -> primeiro.getOrdemChegada() - segundo.getOrdemChegada());

        System.out.println("--- ordem natural dos números - ordem de chegada ---");
        System.out.println(ordemDeChegada);

        AdicionaList(ordemDeChegada);

        ordemDeChegada.sort(Comparator.comparingInt(Cliente::getOrdemChegada));

        System.out.println("--- ordem natural dos números - ordem de chegada (method reference) ---");
        System.out.println(ordemDeChegada);
    }

    public static void OrdenaTreeSet() {

        TreeSet<Cliente> ordemDeChegada = new TreeSet<>();

        AdicionaTreeSet(ordemDeChegada);

        System.out.println(ordemDeChegada);

        ordemDeChegada.stream().sorted(new ClienteOrdemChegadaComparator());

        System.out.println("--- ordem reversa dos números - idade (interface Comparator) ---");
        System.out.println(ordemDeChegada);

        AdicionaTreeSet(ordemDeChegada);

        ordemDeChegada.stream().sorted(new ClienteOrdemChegadaComparator());

        System.out.println("--- ordem natural dos números - ordem de chegada (interface Comparable) ---");
        System.out.println(ordemDeChegada);

        AdicionaTreeSet(ordemDeChegada);

        ordemDeChegada.stream().sorted((primeiro, segundo) -> primeiro.getOrdemChegada() - segundo.getOrdemChegada());

        System.out.println("--- ordem natural dos números - ordem de chegada ---");
        System.out.println(ordemDeChegada);

        AdicionaTreeSet(ordemDeChegada);

        ordemDeChegada.stream().sorted(Comparator.comparingInt(Cliente::getOrdemChegada));

        System.out.println("--- ordem natural dos números - ordem de chegada (method reference) ---");
        System.out.println(ordemDeChegada);
    }

}
