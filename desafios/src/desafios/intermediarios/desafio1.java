package desafios.intermediarios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class desafio1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Iterator iterator = st.asIterator();

            List<String> palavras = new Vector<>();

            while (iterator.hasNext()) {
                palavras.add(iterator.next().toString());
            }

            if (palavras.contains(".")) { break; }

            List<String> novaFrase = new ArrayList<>();
            LinkedHashMap<String, String> maiorPalavra = new LinkedHashMap<>();
            LinkedHashMap<String, String> novoPadraoPalavra = new LinkedHashMap<>();

            for (int i = 0; i < palavras.size(); i++) {
                if (palavras.get(i).length() <= 2) {
                    novaFrase.add(palavras.get(i));
                } else {
                    if (novoPadraoPalavra.isEmpty()) {
                        novoPadraoPalavra.put(palavras.get(i).toLowerCase().substring(0, 1).concat("."), palavras.get(i));
                        novaFrase.add(palavras.get(i).toLowerCase().substring(0, 1).concat("."));
                        continue;
                    }

                    if (maiorPalavra.isEmpty()) {
                        for (int j = 0; j < palavras.size(); j++) {
                            int k = 0;
                            while (k < palavras.size()) {
                                if (k == j) {
                                    k++;
                                    continue;
                                }
                                if (palavras.get(j).startsWith(palavras.get(k).substring(0, 1))) {
                                    if (palavras.get(j).length() > palavras.get(k).length()) {
                                        maiorPalavra.put(palavras.get(i).toLowerCase().substring(0, 1).concat("."), palavras.get(j));
                                    }
                                }
                                k++;
                            }
                        }
                    }

                    if (!(novoPadraoPalavra.containsKey(palavras.get(i).toLowerCase().substring(0, 1).concat("."))) &&
                            (maiorPalavra.containsValue(palavras.get(i)))) {
                        novoPadraoPalavra.put(palavras.get(i).toLowerCase().substring(0, 1).concat("."), palavras.get(i));
                        novaFrase.add(palavras.get(i).toLowerCase().substring(0, 1).concat("."));
                    } else if (!(novoPadraoPalavra.containsKey(palavras.get(i).toLowerCase().substring(0, 1).concat("."))) &&
                            (maiorPalavra.containsKey(palavras.get(i).toLowerCase().substring(0, 1).concat(".")))) {
                        novaFrase.add(palavras.get(i).toLowerCase());
                    } else if (!(novoPadraoPalavra.containsKey(palavras.get(i).toLowerCase().substring(0, 1).concat(".")))) {
                        novoPadraoPalavra.put((palavras.get(i).toLowerCase().substring(0, 1).concat(".")), palavras.get(i));
                        novaFrase.add(palavras.get(i).toLowerCase().substring(0, 1).concat("."));
                    } else {
                        novaFrase.add(palavras.get(i).toLowerCase());
                    }

                }
            }

            System.out.println(novaFrase.stream()
                    .collect(Collectors.joining(" ")));

            System.out.println(novoPadraoPalavra.size());

            for (Map.Entry<String, String> entry : novoPadraoPalavra.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }

        }
    }
}
