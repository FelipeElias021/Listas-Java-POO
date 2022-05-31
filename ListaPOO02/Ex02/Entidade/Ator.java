package ListaPOO02.Ex02.Entidade;

public class Ator {
    private String nome;
    private int idade;
    private int n_oscars;

    public Ator (String nome, int idade, int n_oscars) {
        this.nome = nome;
        this.idade = idade;
        this.n_oscars = n_oscars;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public int getNOscar() {
        return n_oscars;
    }

    public void setNOscar (int n_oscars) {
        this.n_oscars = n_oscars;
    }

}
