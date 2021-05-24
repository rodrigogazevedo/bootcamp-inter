package one.digitalinnovation.paradigmaFuncional;

public class FuncaoComClasseAnonima {

    public static void main(String[] args) {

        Funcao colocarPreficoSenhorNaString = new Funcao() {
            @Override
            public String gerar(String valor) { return "Sr. " + valor; }
        };

        System.out.println(colocarPreficoSenhorNaString.gerar("João"));
    }
}
