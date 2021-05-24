package one.digitalinnovation.paradigmaFuncional;

import java.util.function.UnaryOperator;

public class Aula {

    public static void main(String[] args) {

        UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor*3;
        int valor = 10;
        System.out.println("O resultado é :: "+calcularValorVezesTrinta.apply(valor));
    }
}
