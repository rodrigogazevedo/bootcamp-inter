package exemplo_classes_2;

public class ExemploConstrutorCarro {

    public static void main(String args[]) {
        Carro carro = new Carro("Chevrolet", "LTZ", 2021, "Automático");

        System.out.println("Marca: "+carro.getMarca());
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Ano: "+carro.getAno());
        System.out.println("Variante: "+carro.getVariante());
    }
}
