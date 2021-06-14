package com.teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Teste {

    public static void main(String[] args) throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String resposta = br.readLine().trim();
        String[] respostaSeparado = resposta.split(" ");
        int codigo = Integer.parseInt(respostaSeparado[0]);
        int quantidade = Integer.parseInt(respostaSeparado[1]);
        double total = 0;

        switch(codigo){
            case 1: total = quantidade * 4.00;
                    break;
            case 2: total = quantidade * 4.50;
                    break;
            case 3: total = quantidade * 5.00;
                    break;
            case 4: total = quantidade * 2.00;
                    break;
            case 5: total = quantidade * 1.50;
        }

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Total: R$ "+df.format(total).replace(",","."));

    }

}
