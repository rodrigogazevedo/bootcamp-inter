package exemplo_calendar;

import java.util.*;

public class ExemploCalendar {

    public static void main(String[] args) {
        Calendar dateNow = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data de vencimento - no seguinte formato: dd/mm/yyyy");
        String dataVencimento = scanner.next();
        String[] dataVencimentoSeparado = dataVencimento.split("/");

        Calendar dateVencimento = Calendar.getInstance();
        dateVencimento.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dataVencimentoSeparado[0]));
        dateVencimento.set(Calendar.MONTH, Integer.parseInt(dataVencimentoSeparado[1])-1);
        dateVencimento.set(Calendar.YEAR, Integer.parseInt(dataVencimentoSeparado[2]));

        long diasVencidos = diasDiferencaVenc(dateVencimento, dateNow);

        System.out.println(dateVencimento.getTime());

        if((dateNow.getTime().after(dateVencimento.getTime())) && (diasVencidos <= 10)) {
            System.out.println("Você tem "+diasVencidos+" dias para pagar");
        }else if ( (dateNow.getTime().after(dateVencimento.getTime())) && (diasVencidos > 10 &&
                ( (dateNow.get(Calendar.DAY_OF_WEEK) == 7) || dateNow.get(Calendar.DAY_OF_WEEK) == 1) ) ) {
            System.out.println("Você tem até o próximo dia útil para pagar");
        }
    }

    public static long diasDiferencaVenc(Calendar startDate, Calendar endDate) {
        Calendar date = (Calendar) startDate.clone();
        long tempoVencimento = 0;
        while (date.before(endDate)) {
            date.add(Calendar.DAY_OF_MONTH, 1);
            tempoVencimento++;
        }
        return tempoVencimento;
    }
}
