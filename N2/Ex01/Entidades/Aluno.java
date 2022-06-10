package N2.Ex01.Entidades;

public class Aluno {
    private int codigo, idade;
    private String nome, cpf, endereco;
    private boolean sexo;
    private Notas notas;

    public Aluno(int codigo, int idade, String nome, String cpf, String endereco, boolean sexo, Notas notas) {
        this.codigo = codigo;
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sexo = sexo;
        this.notas = notas;
    }

    public String getSituacao() {
        if (notas.getMedia() >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "\n\n---------------------------\n"
                + "Aluno " + nome
                + ", código " + codigo
                + "\nCPF: " + cpf
                + "\nEndereço: " + endereco
                + (String)(sexo ? "\nSexo: Masculino" : "\nSexo: Feminino")
                + "\nNotas: " + getSituacao()
                + notas.toString();
    }

}
