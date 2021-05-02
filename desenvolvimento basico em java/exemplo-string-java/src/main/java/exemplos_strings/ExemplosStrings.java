package exemplos_strings;

public class ExemplosStrings {

    public static void main(String[] args) {
        String s = "Aula de Java";

        System.out.println("A B C D E F G".toCharArray());
        String[] strs = s.split(" ");
        System.out.println(""+strs[0]+" "+strs[1]+" "+strs[2]);
        System.out.println("Aula".concat(" de Java"));
        System.out.println("1234 asda qw".replaceAll("[0-9]","#"));
    }
}
