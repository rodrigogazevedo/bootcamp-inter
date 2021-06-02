package desafios.intermediarios;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class desafio3 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String primeiraString, segundaString, stringMaior , stringMenor ;
        while (( primeiraString = in.readLine()) != null) {
            segundaString = in.readLine();
            if ( primeiraString.length() > segundaString.length() ) {
                stringMaior = primeiraString;
                stringMenor = segundaString;
            } else {
                stringMaior = segundaString;
                stringMenor = primeiraString;
            }
            int minLength = stringMenor.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) {
                int diff = minLength - maxS;
                for (int i = 0; i <= diff ; i++) {
                    if (stringMaior.contains(stringMenor.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }

}