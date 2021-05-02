package exemplo_localDate;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExemploLocalDate {

    public static void main (String[] args) {
        LocalDateTime dataHoraPresente = LocalDateTime.of(2010,05,15,10,00,00);

        System.out.println(dataHoraPresente);

        LocalDateTime dataHoraFuturo = dataHoraPresente.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(dataHoraFuturo);
    }
}
