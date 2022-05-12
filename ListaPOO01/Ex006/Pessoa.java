package ListaPOO01.Ex006;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String toString() {
        return nome + ", " + idade + " anos, " + altura + " m";
    }
}
