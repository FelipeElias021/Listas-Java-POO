package N1FelipeElias.Ex4;

public class Alunos {
    public int Id;
    public String Nome;
    public double Notas[] = new double[2];
    public double Media;
    public String Situacao;

    public Alunos(int id, String nome, double [] notas) {
        this.Id = id;
        this.Nome = nome;
        this.Notas = notas;
        this.Media = SetMedia(notas);
        this.Situacao = SetSituacao(Media);
    }

    private double SetMedia (double [] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    private String SetSituacao (double media) {
        if (media <= 4) {
            return "Reprovado";
        } else if (media <= 6) {
            return "Exame";
        } else {
            return "Aprovado";
        }
    }

    public String GetAluno() {
        return "Aluno(a) " + Nome + " teve uma média de " + Media + ", e está " + Situacao;
    }
}
