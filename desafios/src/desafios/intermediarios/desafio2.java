package desafios.intermediarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class desafio2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        List<String> resultado = new ArrayList<>();

        while(true) {
            int quantidadeSubconjuntos = sc.nextInt();

            if (quantidadeSubconjuntos == 0) {
                break;
            }

            String subconjunto = "";

            while (quantidadeSubconjuntos > 0) {
                subconjunto += sc.next().concat(" ");

                quantidadeSubconjuntos--;
            }

            List<String> conjuntos = Arrays.asList(subconjunto.split(" "));

            int quantidadeComparacao = 0;

            for (int i = 0; i < conjuntos.size() ; i++) {
                String subconjuntoComparacao = conjuntos.get(i);
                for (int j = 0; j < conjuntos.size(); j++) {
                    if ((conjuntos.get(j).startsWith(subconjuntoComparacao)) && (j != i)) {
                        quantidadeComparacao++;
                    }
                }
            }

            if (quantidadeComparacao > 0) {
                resultado.add("Conjunto Ruim");
            }else {
                resultado.add("Conjunto Bom");
            }
        }
        resultado.stream().forEach(System.out::println);
    }
}
