package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploFinal {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        Iterator<String> iteratorFila = fila.iterator();

        while(iteratorFila.hasNext()) {
            System.out.println("-->" +iteratorFila.next());
        }

        System.out.println(fila.peek());

        fila.poll();

        System.out.println(fila.peek());

        fila.add("Daniel");

        System.out.println(fila);

        int cont = 0;

        iteratorFila = fila.iterator();

        while(iteratorFila.hasNext()) {
            if (iteratorFila.next().equals("Daniel")) {
                break;
            }
            cont++;
        }

        System.out.println("A posição do Daniel na fila é: "+cont);

        System.out.println(fila.size());

        System.out.println(fila.isEmpty());

        System.out.println(fila.contains("Carlos"));
    }
}
