package ListaPOO02.Ex04.Entidade;

import java.util.Random;

public class Pessoa {
    private String nome;
	private Dado meuDadoDe6faces;
	private Dado meuDadoDe8faces;
    private String sexo;
    private Data dataNascimento;
    private Endereco endereco;


    /*
    ----------------------------------------------------------------
    CONSTRUTORES
    ----------------------------------------------------------------
    */
	public Pessoa(String nome, String sexo, Data dataNascimento, Endereco endereco){
		this.nome = nome;
        this.meuDadoDe6faces = new Dado();
        this.meuDadoDe8faces = new Dado(8);
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
	}

	
    /*
    ----------------------------------------------------------------
    METHODS
    ----------------------------------------------------------------
    */

    public int jogarDadoDe6Faces(){
		Random r = new Random();
		return r.nextInt(this.meuDadoDe6faces.getNLados()) + 1;
	}

    public int jogarDadoDe8Faces(){
		Random r = new Random();
		return r.nextInt(this.meuDadoDe8faces.getNLados()) + 1;
	}
	
    /*
    ----------------------------------------------------------------
    Métodos GET e SET
    ----------------------------------------------------------------
    */
	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

    public Dado getMeuDadoDe6faces() {
        return meuDadoDe6faces;
    }

    public void setMeuDadoDe6faces(Dado meuDadoDe6faces) {
        this.meuDadoDe6faces = meuDadoDe6faces;
    }

    public Dado getMeuDadoDe8faces() {
        return meuDadoDe8faces;
    }

    public void setMeuDadoDe8faces(Dado meuDadoDe8faces) {
        this.meuDadoDe8faces = meuDadoDe8faces;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
