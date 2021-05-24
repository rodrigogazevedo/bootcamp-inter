package one.digitalinnovation.interfacesFuncionais;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroECalcularDobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornarNomeAoContrario.apply("Rodrigo"));
        System.out.println(converterStringParaInteiroECalcularDobro.apply("20"));
    }
}
