package desafios.intermediarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class desafio5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new  BufferedReader ( new InputStreamReader( System.in));
        String senha;

        while((senha = br.readLine()) != null) {

            boolean tamanhoSenha = senha.length() >= 6 && senha.length() <= 32;

            boolean contemNumero = false;
            boolean contemLetrasMaiusculas = false;
            boolean contemLetrasMinusculas = false;

            boolean contemEspacoEmBranco = senha.contains(" ");

            Pattern pattern = Pattern.compile("\\w.*");
            Pattern pattern2 = Pattern.compile("\\p{Punct}.*");

            for (int i = 0; i < senha.length(); i++) {
                if(Character.isDigit(senha.charAt(i))) contemNumero = true;
                else if (Character.isUpperCase(senha.charAt(i))) contemLetrasMaiusculas = true;
                else if (Character.isLowerCase(senha.charAt(i))) contemLetrasMinusculas = true;
            }

            Matcher matcher1 = pattern.matcher(senha);
            Matcher matcher2 = pattern2.matcher(senha);

            if(tamanhoSenha && !contemEspacoEmBranco && contemLetrasMaiusculas && contemLetrasMinusculas) {
                if (matcher1.find() && !matcher2.find()) {
                    System.out.println("Senha valida.");
                }else {
                    System.out.println("Senha invalida.");
                }
            }else {
                System.out.println("Senha invalida.");
            }

        }
	}
}