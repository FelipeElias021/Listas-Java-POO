package ListaPOO01.Ex003;


public class AlunosTeste {
    public static void main(String[] args) {
        Alunos aluno = new Alunos(765 ,"Felipe", 8, 2.5, 4);

        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Média Final: " + aluno.Media());
        System.out.println("Nota necessaria no exame final: " + aluno.Final());
    }
}
