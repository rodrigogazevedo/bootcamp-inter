package one.digitalinnovation.optionals;

import java.util.Optional;

public class ExemploFinal {

    public static void main(String[] args) {

        Optional<String> emptyString = Optional.empty();
        Optional<String> optionalString = Optional.of("Valor presente");
        Optional<String> optionalNull = Optional.ofNullable(null);

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

        //System.out.println(emptyString.orElseThrow(IllegalStateException::new));

        emptyString.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));

        optionalString.ifPresentOrElse((value) -> System.out.println("Existe um valor aqui"), () -> System.out.println("não está presente"));

        optionalString.ifPresentOrElse((value) -> System.out.println(value), () -> System.out.println("não está presente"));

        optionalString.filter((value) -> value.equals("Valor igual")).ifPresent(System.out::println);

        //System.out.println(emptyString.get());

    }
}
