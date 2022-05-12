package ListaPOO01.Ex006;

import java.util.LinkedList;

public class Agenda {
    LinkedList<Pessoa> fila = new LinkedList<Pessoa>();

    public void armazenaPessoa (String nome, int idade, double altura) {
        fila.add(new Pessoa(nome, idade, altura));
    }

    public void removePessoa (String nome) {
        fila.removeIf(obj -> obj.nome == nome);
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < fila.size(); i++) {
            if (fila.get(i).nome == nome) {
                return i;
            }
        }
        return -1;
    }

    public void imprimirAgenda() {
        System.out.println();
        for (Pessoa pessoa : fila) {
            System.out.println(pessoa.toString());
        }
        System.out.println();
    }

    public void imprimePessoa(int index) {
        System.out.println(fila.get(index).toString());
    }
}
