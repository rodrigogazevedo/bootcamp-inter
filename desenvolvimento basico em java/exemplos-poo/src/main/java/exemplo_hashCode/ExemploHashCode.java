package exemplo_hashCode;

import exemplo_hashCode.Atendente;
import exemplo_hashCode.Gerente;
import exemplo_hashCode.Supervisor;

public class ExemploHashCode {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("João", 2000,"GER01");
        Gerente gerente2 = new Gerente("João", 2000,"GER01");

        System.out.println(gerente1.equals(gerente2));

        Supervisor supervisor1 = new Supervisor("Pedro", 3500, "SUP01");
        Supervisor supervisor2 = new Supervisor("Pedro", 3500, "SUP01");

        System.out.println(supervisor1.equals(supervisor2));

        Atendente atendente1 = new Atendente("Nelson", 1300, "ATD01");
        Atendente atendente2 = new Atendente("Nelson", 1300, "ATD01");

        System.out.println(atendente1.equals(atendente2));
    }
}
