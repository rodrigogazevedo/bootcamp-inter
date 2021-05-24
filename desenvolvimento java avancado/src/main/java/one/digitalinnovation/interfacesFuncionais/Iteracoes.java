package one.digitalinnovation.interfacesFuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Rodrigo", "Rodrigo", "Guimarães", "de", "Azevedo"};
        Integer[] numeros = {1,2,3,4,5};
     //   imprimirNomesFiltrados(nomes);
     //   imprimirTodosNomes(nomes);
     //   imprimirODobroDeCadaItemDaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de Projeto");
        profissoes.add("Gerente de Qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes) {
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Rodrigo")) {
                nomesParaImprimir +=""+nomes[i];
            }
        }

        System.out.println("Nomes do for: "+nomesParaImprimir);

        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Rodrigo"))
                .collect(Collectors.joining());//String

        System.out.println("Nomes do stream: "+nomesParaImprimirDaStream);

    //    String nomesResultados = Stream.of(nomes).filter(nome -> nome.equals("Rodrigo"))
    //            .collect(Collectors.joining());
    //    System.out.println(nomesResultados);;

    }

    public static void imprimirTodosNomes(String... nomes) {
        for(String nome : nomes) {
            System.out.println("Imprimido pelo for: "+nome);
        }

        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo forEach: "+nome));
    }

    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros) {
        for(Integer numero : numeros) {
            System.out.println(numero*2);
        }

        Stream.of(numeros)
                .map(numero -> numero*2).forEach(System.out::println);
    }
}
