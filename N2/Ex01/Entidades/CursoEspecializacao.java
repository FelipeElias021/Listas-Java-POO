package N2.Ex01.Entidades;

import java.util.ArrayList;

public class CursoEspecializacao extends Curso{
    private boolean latoSensu;
    private double adicionalDiploma;

    public CursoEspecializacao(int código, int cargaHoraria, int sala, String nome, String nomeProfessor,
            double valorCurso, ArrayList<Aluno> alunos, boolean latoSensu) {
        super(código, cargaHoraria, sala, nome, nomeProfessor, valorCurso, alunos);
        this.latoSensu = latoSensu;
    }

    public boolean isLatoSensu() {
        return latoSensu;
    }

    public void setLatoSensu(boolean latoSensu) {
        this.latoSensu = latoSensu;
    }

    public double getAdicionalDiploma() {
        return adicionalDiploma;
    }

    @Override
    public boolean isAluno(String nome) {
        return super.isAluno(nome);
    }

    public void setAdicionalDiploma() {
        int qtdAlunos = super.getAlunos().size();
        if (qtdAlunos <= 10) {
            this.adicionalDiploma = 25 * qtdAlunos;
        } else if (qtdAlunos <= 30) {
            this.adicionalDiploma = 20 * qtdAlunos;
        } else {
            this.adicionalDiploma = 18 * qtdAlunos;
        }
    }
    
    @Override
    public String toString() {
        return super.toString()
            + "\nLato Sensu: " + latoSensu
            + "\nAdicional Diploma: " + adicionalDiploma;
    }
}
