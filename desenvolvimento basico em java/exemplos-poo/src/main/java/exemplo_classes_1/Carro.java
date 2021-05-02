package exemplo_classes_1;

import java.util.ArrayList;

public class Carro {
    int quantPessoa = 5;

    public int getQuantPessoa() { return quantPessoa; }

    public ArrayList<String> adicionaListaPessoas(String nome, ArrayList<String> listaPessoas) {
        if (listaPessoas.size() < quantPessoa) {
            listaPessoas.add(nome);
        }else {
            System.out.println("Excedeu a capacidade do veículo - Capacidade Máxima é "+quantPessoa);
        }
        return listaPessoas;
    }

    public ArrayList<String> removeListaPessoas(String nome, ArrayList<String> listaPessoas) {
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).equals(nome)) {
                listaPessoas.remove(i);
                break;
            }else if (i == (listaPessoas.size() - 1)) {
                System.out.println("Nome não encontrado!!!");
            }
        }

        return listaPessoas;
    }
}
