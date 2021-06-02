package desafios.intermediarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class desafio4 {
    public static void main(String[] args) throws IOException {
        BufferedReader in =  new  BufferedReader ( new InputStreamReader( System.in));
        String palavra;
        while((palavra = in.readLine()) != null) {

            boolean palavraRepetida = false;

            for (int i = 0; i <= palavra.length() - 1; i++) {
                if (palavra.substring(0,i).endsWith(palavra.substring(i))) {
                    System.out.println(palavra.substring(0,i));
                    palavraRepetida = true;
                    break;
                }
            }

            if (!palavraRepetida) {
                System.out.println(palavra);
            }
        }
    }
}
