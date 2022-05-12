package N1FelipeElias;

import java.util.Scanner;

/*
Escreva um programa que leia dois vetores – V1 e V2 – cada um com N(N<=10)
valores reais e um terceiro vetor – Op - com N valores do tipo caracter. Seu programa
deve gerar um vetor – Resul como sendo o resultado das operações de V1 com V2, onde
o código da operação está no vetor Op nas respectivas posições.
V1      4   7   10    12    3

Op      +   -   *     +     *

V2      8   13  10    18    30

Resul   12  -6  100   30    90
*/


public class Ex5 {
    public static void main(String[] args) {
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        char[] op = new char[5];
        double[] resul = new double[5];

        Scanner entrada = new Scanner(System.in);
    
        for (int i = 0; i < v1.length; i++) {
            System.out.print("Digite um número para o primeiro vetor: ");
            v1[i] = entrada.nextInt();
        }
        System.out.println();
        for (int i = 0; i < v2.length; i++) {
            System.out.print("Digite um número para o primeiro vetor: ");
            v2[i] = entrada.nextInt();
        }
        System.out.println();
        for (int i = 0; i < op.length; i++) {
            System.out.print("Digite um Operador: (+ / - / / / *) ");
            op[i] = entrada.next().charAt(0);
            if (op[i] != '/' && op[i] != '+' && op[i] != '-' && op[i] != '*') {
                System.out.print("Operador inválido, defina outra operação: ");
                op[i] = entrada.next().charAt(0);
            }
            if (op[i] == '/' && v2[i] == 0) {
                System.out.print("A divisão não pode ter o divisor 0, defina outra operação: ");
                op[i] = entrada.next().charAt(0);
            }
        }
        
        entrada.close();

        System.out.println();
        for (int i = 0; i < resul.length; i++) {
            if (op[i] == '+') {
                resul[i] = v1[i] + v2[i];
            } else if (op[i] == '-') {
                resul[i] = v1[i] - v2[i];
            } else if (op[i] == '/') {
                resul[i] = v1[i] / v2[i];
            } else if (op[i] == '*') {
                resul[i] = v1[i] * v2[i];
            }

            System.out.println(v1[i] + "\t" + op[i] + "\t" + v2[i] + ":\t" + resul[i]);
        }
    }
}
