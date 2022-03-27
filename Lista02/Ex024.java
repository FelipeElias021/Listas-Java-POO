package Lista02;

import java.util.Scanner;

/*Faça um programa que leia um código inteiro e um vetor de 10 posições de números reais.
Se o código for zero, termine o programa. Se for 1, mostre o vetor na ordem direta. Se for
2, mostre o vetor na ordem inversa.*/

public class Ex024 {
    public static void main(String[] args) {
        int opc;
        int[] nums = new int[10];
        //int[] nums = {4, 3, 7, 1, 8, 9, 2, 10, 5, 6}; MODO DEBUG
        int[] numsModificado;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número inteiro: ");
            nums[i] = entrada.nextInt();
        }

        Menu();
        opc = entrada.nextInt();

        entrada.close();

        System.out.println();
        switch (opc) {
            case 1:
                numsModificado = ordemDireta(nums);
                for (int i = 0; i < numsModificado.length; i++) {
                    System.out.print(numsModificado[i] + " ");
                }
                break;
            case 2:
                numsModificado = ordemInversa(nums);
                for (int i = 0; i < numsModificado.length; i++) {
                    System.out.print(numsModificado[i] + " ");
                }
                break;
            case 0:
                System.out.println("\nTerminado!");
                break;
            default:
                System.out.println("\nOpção inválida!");
        }

    }

    public static void Menu() {

        System.out.println("Modificação\t\t Código");
        System.out.println("Ordem Direta\t\t 1");
        System.out.println("Ordem Inversa\t\t 2");
        System.out.println("Terminar\t\t 0");
        System.out.print("\nInforme a opção desejada: ");
    }

    public static int[] ordemDireta(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    int help = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = help;
                }

                /*System.out.println();
                System.out.print(i + ", " + j + ":\t");
                for (int k = 0; k < vetor.length; k++) {
                    System.out.print(vetor[k] + " ");
                }
                MODO DEBUG*/
            }
        }

        return vetor;
    }

    public static int[] ordemInversa(int[] vetor) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            for (int j = vetor.length - 1; j > i; j--) {
                if (vetor[i] < vetor[j]) {
                    int help = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = help;
                }
            }
        }

        return vetor;
    }
}
