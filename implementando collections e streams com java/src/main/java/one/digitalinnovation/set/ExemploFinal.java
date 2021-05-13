package one.digitalinnovation.set;

import java.util.*;

public class ExemploFinal {

    public static void main(String[] args) {
        System.out.println("----------Linked Set----------");
        LinkedSet();
        System.out.println("----------Hash Set----------");
        HashSet();
        System.out.println("----------Tree Set----------");
        TreeSet();
    }

    public static void LinkedSet() {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(3);
        sequenciaNumerica.add(88);
        sequenciaNumerica.add(20);
        sequenciaNumerica.add(44);
        sequenciaNumerica.add(3);

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        sequenciaNumerica.remove(3);

        sequenciaNumerica.add(23);

        System.out.println(sequenciaNumerica);

        System.out.println("Tamanho do Linked Set: "+sequenciaNumerica.size());

        System.out.println("Linked Set está vazio: "+sequenciaNumerica.isEmpty());
    }

    public static void HashSet() {
        Set<Integer> sequenciaNumerica = new HashSet<>();

        sequenciaNumerica.add(3);
        sequenciaNumerica.add(88);
        sequenciaNumerica.add(20);
        sequenciaNumerica.add(44);
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(null);

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        sequenciaNumerica.remove(3);

        sequenciaNumerica.add(23);

        System.out.println(sequenciaNumerica);

        System.out.println("Tamanho do Linked Set: "+sequenciaNumerica.size());

        System.out.println("Linked Set está vazio: "+sequenciaNumerica.isEmpty());
    }

    public static void TreeSet() {

        TreeSet<Integer> sequenciaNumerica = new TreeSet<>();

        sequenciaNumerica.add(3);
        sequenciaNumerica.add(88);
        sequenciaNumerica.add(20);
        sequenciaNumerica.add(44);
        sequenciaNumerica.add(3);

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        sequenciaNumerica.remove(3);

        sequenciaNumerica.add(23);

        System.out.println(sequenciaNumerica);

        System.out.println("Tamanho do Linked Set: "+sequenciaNumerica.size());

        System.out.println("Linked Set está vazio: "+sequenciaNumerica.isEmpty());
    }
}
