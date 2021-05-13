package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class ExemploFinal {

    public static void main(String[] args) {

        System.out.println("----------Linked Set----------");
        HashMap();
        System.out.println("\n----------Hash Set----------");
        //HashTable();
        System.out.println("\n----------Tree Set----------");
        //TreeMap();
    }

    public static void HashMap() {

        Map<String, String> estados = new HashMap<>();

        /*estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("ES", "Espírito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minasa Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande Do Norte");
        estados.put("RS", "Rio Grande Do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");*/

        estados.put("RS", "Porto Alegre");
        estados.put("PB", "João Pessoa");
        estados.put("TO", "Palmas");
        estados.put("RJ", "Rio de Janeiro");
        //estados.put("RS", "Gravataí");

        estados.put(null, "São Paulo");
        estados.put(null, "Florianópolis");

        System.out.println(estados);

        estados.remove("MG");

        estados.put("DF", "Distrito Federal");

        System.out.println("Tamanho do mapa: "+estados.size());

        estados.remove("MS", "Mato Grosso do Sul");

        System.out.println(estados);

        for(Map.Entry<String, String> entry : estados.entrySet()) {
            System.out.println(entry.getValue() + " (" + entry.getKey() +")");
        }

        for(String key : estados.keySet()) {
            System.out.println(estados.get(key) + " (" + key + ")");
        }

        System.out.println("Santa Catarina existe no mapa? --> "+estados.containsKey("SC"));

        System.out.println("Maranhão existe no mapa? --> "+estados.containsValue("Maranhão"));

    }

    public static void HashTable() {

        Hashtable<String, String> estados = new Hashtable<>();

        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("ES", "Espírito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minasa Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande Do Norte");
        estados.put("RS", "Rio Grande Do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");

        System.out.println(estados);

        estados.remove("MG");

        estados.put("DF", "Distrito Federal");

        System.out.println("Tamanho do mapa: "+estados.size());

        estados.remove("MS", "Mato Grosso do Sul");

        System.out.println(estados);

        for(Map.Entry<String, String> entry : estados.entrySet()) {
            System.out.println(entry.getValue() + " (" + entry.getKey() + ")");
        }

        for (String key : estados.keySet()) {
            System.out.println(estados.get(key) + " (" + key + ")");
        }

        System.out.println("Santa Catarina existe no mapa? --> "+estados.containsKey("SC"));

        System.out.println("Maranhão existe no mapa? --> "+estados.containsValue("Maranhão"));
    }

    public static void TreeMap() {

        TreeMap<String, String> estados = new TreeMap<>();
        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("ES", "Espírito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minasa Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande Do Norte");
        estados.put("RS", "Rio Grande Do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");

        System.out.println(estados);

        estados.remove("MG");

        estados.put("DF", "Distrito Federal");

        System.out.println("Tamanho do mapa: "+estados.size());

        estados.remove("MS", "Mato Grosso do Sul");

        System.out.println(estados);

        for(Map.Entry<String, String> entry : estados.entrySet()) {
            System.out.println(entry.getValue() + " (" + entry.getKey() +")");
        }

        for(String key : estados.keySet()) {
            System.out.println(estados.get(key) + " (" + key + ")");
        }

        System.out.println("Santa Catarina existe no mapa? --> "+estados.containsKey("SC"));

        System.out.println("Maranhão existe no mapa? --> "+estados.containsValue("Maranhão"));

    }
}
