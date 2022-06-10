package N2.Ex01.Entidades;

public class AlunoMasculino extends Aluno {
    private String identidadeMilitar;

    public AlunoMasculino(int codigo, int idade, String nome, String cpf, String endereco, boolean sexo, Notas notas,
            String identidadeMilitar) {
        super(codigo, idade, nome, cpf, endereco, sexo, notas);
        this.identidadeMilitar = identidadeMilitar;
    }

    public String getIdentidadeMilitar() {
        return identidadeMilitar;
    }

    public void setIdentidadeMilitar(String identidadeMilitar) {
        this.identidadeMilitar = identidadeMilitar;
    }

    @Override
    public String toString() {
        return super.toString()
            + "\nIdentidade Militar: " + identidadeMilitar;
    }
}
