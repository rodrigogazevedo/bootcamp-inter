package one.digitalinnovation.novidadesJava10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {

    public static void main(String[] args) {
        var nome = "rodrigo";
        System.out.println(nome);
        connectAndPrintURLJavaOracle();
    }

    private static void connectAndPrintURLJavaOracle(){


        try{
            var url = new URL("https://docs.oracle.com/javase/10/language/");
            var urlConnection = url.openConnection();
            try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void printarNomeCompleto(String nome, String sobrenome) {
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static void printarSoma(int... numeros){
        int soma = 0;
        if (numeros.length > 0) {
            soma = 0;
            for (var numero = 0; numero < numeros.length; numero++){
                soma+=numeros[numero];
            }
            System.out.println("A soma é ::: "+soma);
        }
    }

    //Consegue

    // variáveis locais inicializadas
    // variável suporte do enhanced for
    // variável suporte do for iterativo
    // variável try with resource

    ///Não consegue

    // var nao pode ser utilizado em nível de classe
    // var não pode ser utilizado como parâmetro
    // var não pode ser utilizada em variáveis locais não inicializados
}
