package N2.Ex01.Entidades;

import java.util.ArrayList;

public class CursoMestrado extends Curso {
    private boolean strictoSensu;
    private double adicionalDiploma;
    
    public CursoMestrado(int código, int cargaHoraria, int sala, String nome, String nomeProfessor, double valorCurso,
            ArrayList<Aluno> alunos, boolean strictoSensu) {
        super(código, cargaHoraria, sala, nome, nomeProfessor, valorCurso, alunos);
        this.strictoSensu = strictoSensu;
    }

    public boolean isStrictoSensu() {
        return strictoSensu;
    }

    public void setStrictoSensu(boolean strictoSensu) {
        this.strictoSensu = strictoSensu;
    }

    public double getAdicionalDiploma() {
        return adicionalDiploma;
    }

    public void setAdicionalDiploma() {
        int qtdAlunos = super.getAlunos().size();
        if (qtdAlunos <= 5) {
            this.adicionalDiploma = 45 * qtdAlunos;
        } else if (qtdAlunos <= 15) {
            this.adicionalDiploma = 43 * qtdAlunos;
        } else if (qtdAlunos <= 30) {   
            this.adicionalDiploma = 40 * qtdAlunos;
        } else {
            this.adicionalDiploma = 36 * qtdAlunos;
        }
    }

    @Override
    public boolean isAluno(String nome) {
        return super.isAluno(nome);
    }

    @Override
    public String toString() {
        return super.toString()
            + "\nStricto Sensu: " + strictoSensu
            + "\nAdicional Diploma: " + adicionalDiploma;
    }
}
