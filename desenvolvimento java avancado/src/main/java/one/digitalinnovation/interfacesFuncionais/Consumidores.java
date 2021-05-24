package one.digitalinnovation.interfacesFuncionais;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        ///Method Reference

        //-apensa
        //utilizar o parametro da forma que ele foi recebido

        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");

    }
}
