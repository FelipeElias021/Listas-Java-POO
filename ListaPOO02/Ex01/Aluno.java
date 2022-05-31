package ListaPOO02.Ex01;

public class Aluno {
    private String matricula;
    private String nome;
    private double notaBimestre1;
    private double notaBimestre2;

    public Aluno (String matricula, String nome, double notaBimestre1, double notaBimestre2) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaBimestre1 = notaBimestre1;
        this.notaBimestre2 = notaBimestre2;
    }

    public String getMatricula() {
		return matricula;
	}

	public void setMatricula (String matricula) {
		this.matricula = matricula;
	}

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public double getNotaBimestre1 () {
		return notaBimestre1;
	}

	public void setNotaBimestre1 (double notaBimestre1) {
		this.notaBimestre1 = notaBimestre1;
	}

    public double getNotaBimestre2 () {
		return notaBimestre2;
	}

	public void setNotaBimestre2 (double notaBimestre2) {
		this.notaBimestre2 = notaBimestre2;
	}

    public String Situacao() {
        double media = (notaBimestre1 + notaBimestre2) / 2;
        if (media >= 6) {
            return "APROVADO";
        }
        return "REPROVADO";
    }

    public String toString() {
        return "\nNome: "+this.nome
                + "\nmatrícula: " + this.matricula
                + "\nSituação: " + this.Situacao()
                + "\n----------------------------\n";
    }
}
