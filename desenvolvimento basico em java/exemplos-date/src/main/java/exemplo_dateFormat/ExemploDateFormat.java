package exemplo_dateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDateFormat {

    public static void main (String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mmm");

        String dataFormata = formatter.format(agora);

        System.out.println(dataFormata);

        String dateNasc = "19/11/1990 12:10:00:000";
        Date dataNascimento;
        try {
            dataNascimento = formatter.parse(dateNasc);

            System.out.println(dataNascimento);
        }catch(ParseException e){
            e.printStackTrace();
        }

    }
}
