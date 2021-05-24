package one.digitalinnovation.paradigmaFuncional;

import java.util.function.UnaryOperator;

public class Imultabilidade {

    public static void main(String[] args) {

        int valor = 20;
        UnaryOperator<Integer> retornarDobro = v -> v * 2;
        System.out.println(retornarDobro.apply(valor)); // retorna o dobro do valor 40
        System.out.println(valor); // valor não será alterado
    }
}
