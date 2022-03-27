package Lista02;

import java.util.Scanner;

/*Escrever um programa que leia o número de identificação, as 3 notas obtidas por um
aluno nas 3 verificações e a média dos exercícios que fazem parte da avaliação. Valide
para que todas as entradas sejam 0 ≤ nota ≤ 10. Calcule a média de aproveitamento do
aluno, usando a fórmula:
𝑀é𝑑𝑖𝑎 =
(𝑛𝑜𝑡𝑎1 + 𝑛𝑜𝑡𝑎2 ∗ 2 + 𝑛𝑜𝑡𝑎3 ∗ 3 + 𝑚𝑒𝑑𝑖𝑎 𝑑𝑜𝑠 𝑒𝑥𝑒𝑟𝑐𝑖𝑐𝑖𝑜𝑠)
7
E o seu conceito, usando a tabela a seguir:
Média de Aproveitamento Conceito
>= 9.0 e <= 10  A
>= 7.5 e < 9.0  B
>= 6.0 e < 7.5  C
>= 4.0 e < 6.0  D
< 4.0           E
O programa deve escrever o número do aluno, suas notas, a média dos exercícios, a
média de aproveitamento, o conceito correspondente e a mensagem: APROVADO se o
conceito for A, B ou C e REPROVADO, se o conceito for D ou E.*/

public class Ex005 {
    public static void main(String args[]) {
        int id;
        double[] nota = new double[3];
        double mediaExercicios, media;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Identificação: ");
            id = entrada.nextInt();
            for (int i = 0; i < 3; i++) {
                do {
                    System.out.print("Nota " + (i + 1) + ": ");
                    nota[i] = entrada.nextDouble();

                } while (nota[i] < 0 || nota[i] > 10);
            }
            do {
                System.out.print("Média dos exercícios: ");
                mediaExercicios = entrada.nextDouble();
            } while (mediaExercicios < 0 || mediaExercicios > 10);
        }
        
        media = (nota[0] + nota[1] * 2 + nota[2] * 3 + mediaExercicios) / 7;

        String notaFinal = getNotaFinal(media);

        System.out.print("# " + id + " - " + getResultadoFinal(notaFinal));
    }

    public static String getResultadoFinal(String notaFinal) {
        switch (notaFinal) {
            case "A":
            case "B":
            case "C":
                return "Parabéns você foi aprovado com um " + notaFinal;
            case "D":
            case "E":
                return "Deveria ter estudado mais, reprovado com uma nota de " + notaFinal;
            default:
                return "";
        }
    } 

    public static String getNotaFinal(double nota) {
        if (nota >= 9) {
            return "A";
        } else if (nota >= 7.5) {
            return "B";
        } else if (nota >= 6) {
            return "C";
        } else if (nota >= 4) {
            return "D";
        } else {
            return "E";
        }
    } 


}
