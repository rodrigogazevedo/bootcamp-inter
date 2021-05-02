package exemplo_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDate {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        String dateNasc = "19/11/1990 12:10:00 PM";
        String dateComp = "15/05/2010 00:00:00 AM";
        Date dataNascimento;
        Date dataComparativa;
        try{
            dataNascimento = sdf.parse(dateNasc);
            dataComparativa = sdf.parse(dateComp);

            System.out.println("Data de nascimento em millis: "+dataNascimento.getTime());

            System.out.println("Data de nascimento em formato date: "+dataNascimento);

            if (dataNascimento.after(dataComparativa)) {
                System.out.println("A data de nascimento é posterior a data comparativa");
            } else if (dataNascimento.before(dataComparativa)) {
                System.out.println("A data de nascimento é anterior a data comparativa");
            }

        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
