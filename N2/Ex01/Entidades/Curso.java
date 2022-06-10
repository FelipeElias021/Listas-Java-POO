package N2.Ex01.Entidades;

import java.util.ArrayList;

public class Curso {
    private int codigo, cargaHoraria, sala;
    private String nome, nomeProfessor;
    private double valorCurso;
    private ArrayList<Aluno> alunos;
    public Object isAluno;
    
    public Curso(int codigo, int cargaHoraria, int sala, String nome, String nomeProfessor, double valorCurso,
            ArrayList<Aluno> alunos) {
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.sala = sala;
        this.nome = nome;
        this.nomeProfessor = nomeProfessor;
        this.valorCurso = valorCurso;
        this.alunos = alunos;
    }

    public boolean isAluno(String nome) {
        return alunos.stream().anyMatch(x -> nome == x.getNome());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(double valorCurso) {
        this.valorCurso = valorCurso;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        String nomesAlunos = "\n";
        for (Aluno i : alunos) {
            nomesAlunos += i.getNome() + ", ";
        }

        return "\n\n---------------------------\n" 
        + "Curso " + nome
        + ", código " + codigo
        + "\nNome do Professor: " + nomeProfessor
        + "\nCarga Horária: " + cargaHoraria
        + "\nSala: " + sala
        + "\nMensalidade: " + valorCurso
        + "\nAlunos Matriculados: "
        + nomesAlunos;

    }
}
