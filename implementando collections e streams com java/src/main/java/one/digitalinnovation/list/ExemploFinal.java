package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploFinal {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        Iterator iterator = nomes.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        nomes.set(2, "Roberto");

        System.out.println(nomes.get(1));

        nomes.remove(4);

        nomes.remove("João");

        int tamanho = nomes.size();

        System.out.println(tamanho);

        boolean julianoExiste = nomes.contains("Juliano");

        System.out.println(julianoExiste);

        List<String> novosNomes = new ArrayList<>();

        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");

        nomes.addAll(novosNomes);

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        boolean listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);

        System.out.println(nomes.indexOf("Tatiana"));
    }
}
