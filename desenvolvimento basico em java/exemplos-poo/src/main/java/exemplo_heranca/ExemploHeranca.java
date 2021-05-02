package exemplo_heranca;

public class ExemploHeranca {

    public static void main (String[] args) {
        Gerente gerente = new Gerente("João", 2000, "GER01");
        Supervisor supervisor = new Supervisor("Pedro", 3500, "SUP01");
        Atendente atendente = new Atendente("Nelson", 1300, "ATD01");

        System.out.println("O imposto sobre o salário do gerente "+gerente.getNome()+" é: "+gerente.calculaImposto());
        System.out.println("O imposto sobre o salário do supervisor "+supervisor.getNome()+" é: "+supervisor.calculaImposto());
        System.out.println("O imposto sobre o salário do atendente "+atendente.getNome()+" é: "+atendente.calculaImposto());
    }
}
