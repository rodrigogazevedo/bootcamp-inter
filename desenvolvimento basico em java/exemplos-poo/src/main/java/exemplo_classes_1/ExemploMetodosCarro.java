package exemplo_classes_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploMetodosCarro {

    public static void main(String[] args) {
        ArrayList<String> listaPessoas = new ArrayList<String>();

        Carro carro = new Carro();

        Scanner ler = new Scanner(System.in);

        int quantidade = 6;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o "+(i+1)+" nome: ");
            carro.adicionaListaPessoas(ler.next(), listaPessoas);
        }

        System.out.println("\n"+listaPessoas+"\n");

        System.out.println("Digite um nome para revomer: ");
        String nome = ler.next();

        carro.removeListaPessoas(nome, listaPessoas);

        System.out.println("\n"+listaPessoas);
    }
}
