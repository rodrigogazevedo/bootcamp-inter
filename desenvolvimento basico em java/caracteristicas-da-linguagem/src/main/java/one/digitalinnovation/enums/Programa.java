package one.digitalinnovation.enums;

public class Programa {

    public static void main(String[] args) {
        //final TipoVeiculo tipoveiculo = new TipoVeiculo();

        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);

        //System.out.println(TipoVeiculo.valueOf("aero"));
        System.out.println(TipoVeiculo.valueOf("AEREO"));

        for (TipoVeiculo tipo : TipoVeiculo.values()) {
            System.out.println("Tipo: "+tipo);
        }

        System.out.println("Código do Status CLOSE :"+Status.CLOSE.getCod());
        System.out.println("Código do Status OPEN :"+Status.OPEN.getTexto());
    }
}
