package Lista02.Ex014;

import java.util.ArrayList;
import java.util.Scanner;

/*Faça um programa que receba 2 notas (valide as notas, onde 0.0 ≤ nota ≤ 10) de um
número indeterminado de alunos. Calcule e mostre:
a. A média aritmética das 2 notas lidas;
b. Uma mensagem de acordo com as regras: Até 3 (Reprovado); Entre 3 e 7
(Exame); de 7 para cima (Aprovado);
c. O total de alunos;
d. Quantidade de alunos Aprovados, Reprovados e de Exame.
e. A Média da classe.
f. O nome e a média dos Alunos com a maior e menor média da classe.
*/

public class Ex014 {
    public static void main(String[] args) {
        ArrayList<Alunos> alunos = new ArrayList<Alunos>();
        char continuar;

        //MEDIA GERAL, TOTAL ALUNOS, QTD REPROVADOS, APROVADOS, EXAME

        Scanner entrada = new Scanner(System.in);

        do{
			
            System.out.print("\nNome do aluno: ");
			String nome = entrada.next();

            double notas[] = new double[2];
			for (int i = 0; i < notas.length; i++) {
				System.out.print("Nota " + (i+1) + " : ");
				notas[i] = entrada.nextDouble();
				while (notas[i] < 0 || notas[i] > 10) {
					System.out.println("Nota Inváida, digite novamente!");
					System.out.print("Nota " + (i+1) + " : ");
					notas[i] = entrada.nextDouble();
				}
			}

            alunos.add(new Alunos(nextId(alunos), nome, notas));

            System.out.println(alunos.get(nextId(alunos) - 1).GetAluno());
			
			System.out.print("Continuar? (S/N) ");
			continuar = entrada.next().charAt(0);
			while (continuar != 'S' && continuar != 'N') {
				System.out.println("Resposta " + continuar + " Inválida, digite novamente!");
				System.out.print("Continuar? (S/N) ");
				continuar = entrada.next().charAt(0);
			}
		} while(continuar == 'S');

        entrada.close();

        System.out.println("\nTotal de alunos: " + alunos.size());


        mostrarSituacao(alunos);

        mediaTotal(alunos);

        System.out.println("\nMaior média: " + getMaior(alunos).GetAluno());

        System.out.println("Maior média: " + getMenor(alunos).GetAluno());

    }

    public static int nextId(ArrayList<Alunos> obj) {
        return obj.size();
    }

    public static void mostrarSituacao (ArrayList<Alunos> obj) {
        int qtdReprovado = 0, qtdExame = 0, qtdAprovado = 0;

        for (Alunos aluno : obj) {
            if (aluno.Situacao == "Reprovado") {
                qtdReprovado++;
            } else if (aluno.Situacao == "Exame") {
                qtdExame++;
            } else if (aluno.Situacao == "Aprovado") {
                qtdAprovado++;
            }
        }

        System.out.println("\nAlunos Reprovados: " + qtdReprovado);
        System.out.println("Alunos em Exame: " + qtdExame);
        System.out.println("Alunos em Aprovados: " + qtdAprovado);
    }

    public static void mediaTotal (ArrayList<Alunos> obj) {
        double soma = 0;
        for (Alunos aluno : obj) {
            soma += aluno.Media;
        }

        double mediaGeral = soma / obj.size();

        System.out.println("\nMédia da classe: " + mediaGeral);
    }

    public static Alunos getMaior (ArrayList<Alunos> obj) {
        Alunos maior = obj.get(0);

        for (Alunos aluno : obj) {
            if (aluno.Media > maior.Media) {
                maior = aluno;
            }
        }

        return maior;
    }

    public static Alunos getMenor (ArrayList<Alunos> obj) {
        Alunos menor = obj.get(0);

        for (Alunos aluno : obj) {
            if (aluno.Media < menor.Media) {
                menor = aluno;
            }
        }

        return menor;
    }
}
