package ListaPOO02.Ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalAluno {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Matrícula Aluno: ");
            String matricula = entrada.nextLine();
            System.out.print("Nome Aluno: ");
            String nome = entrada.nextLine();
            System.out.print("Nome 1º Bimestre Aluno: ");
            double nota1 = entrada.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("A nota deve ser 0 <= nota <= 10");
                System.out.print("Digite novamente: ");
                nota1 = entrada.nextDouble();
            }
            System.out.print("Nome 2º Bimestre Aluno: ");
            double nota2 = entrada.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("A nota deve ser 0 <= nota <= 10");
                System.out.println("Digite novamente: ");
                nota2 = entrada.nextDouble();
            }
            alunos.add(new Aluno(matricula, nome, nota1, nota2));
            entrada.nextLine();
            System.out.println();
        }
    entrada.close();

    System.out.println(alunos);
    }
}
