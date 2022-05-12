package ListaPOO01.Ex003;

/*Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina.
Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2
notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:
a. Média: calcula a média final do aluno (composta pela média aritmética
das notas).
b. Final: considerando que a média do aluno esteja abaixo de 6.0, quanto ele
precisaria tirar no Exame Final para que sua média final seja pelo menos
5.0.*/

public class Alunos {
    public int matricula;
    public String nome;
    public double prova1;
    public double prova2;
    public double trabalho;

    public Alunos(int matricula, String nome, double prova1, double prova2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }

    public double Media() {
        double media = (prova1 + prova2 + trabalho) / 3;
        return media;
    }

    public double Final() {
        double media = Media();

        if (media < 6) {
            return 10 - media;
        }
        return 0;
    }
}
