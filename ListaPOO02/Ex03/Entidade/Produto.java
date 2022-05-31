package ListaPOO02.Ex03.Entidade;

public class Produto {
    private int codigo;
    private String nome;

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String ConsultaNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String toString() {
        return "# " + codigo
        + " - " + nome;
    }
}
