package ListaPOO02.Ex03.Entidade;

public class Pessoa {
    private String nome;
    private Endereco endereco;
    private String numero;

    public Pessoa(String nome, String numero, Endereco endereco) {
        this.nome = nome;
        this.numero = numero;
        this.endereco = endereco;
    }

    public String ConsultaNome() {
        return nome;
    }

    public String ConsultaNumero() {
        return numero;
    }

    public Endereco ConsultaEndereco() {
        return endereco;
    }
}