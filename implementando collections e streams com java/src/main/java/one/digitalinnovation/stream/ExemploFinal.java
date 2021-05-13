package one.digitalinnovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploFinal {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante( "Pedro", 19));
        estudantes.add(new Estudante( "Carlos", 23));
        estudantes.add(new Estudante( "Mariana", 17));
        estudantes.add(new Estudante( "João", 18));
        estudantes.add(new Estudante( "Thiago", 20));
        estudantes.add(new Estudante( "Barbára", 22));
        estudantes.add(new Estudante( "Larissa", 16));

        System.out.println(estudantes.stream()
                .peek(estudante -> System.out.println("Nome = "+ estudante.getNome() + " | Idade = " + estudante.getIdade()))
                .collect(Collectors.toList()));

        System.out.println("Contagem: " +estudantes.stream().count());

        System.out.println("Estudantes com idade igual ou superior a 18 anos: " + estudantes.stream().filter((estudante) ->
                estudante.getIdade() >= 18 ).collect(Collectors.toList()));

        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        System.out.println("Estudantes com a letra b no nome: " + estudantes.stream().filter((estudante) ->
                estudante.getNome().toLowerCase().contains("b")).collect(Collectors.toList()));

        System.out.println("Tem algum estudante que tenha a letra d no nome? " +estudantes.stream().anyMatch((elemento) ->
                elemento.getNome().toLowerCase().contains("a")));

        System.out.println("Estudante mais velho: " +estudantes.stream().max(Comparator.comparingInt(estudante -> estudante.getIdade())));

        System.out.println("Estudante mais novo: " +estudantes.stream().min(Comparator.comparingInt(estudante -> estudante.getIdade())));
    }
}
