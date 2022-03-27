package Lista02;

import java.util.Scanner;

/*Faça um programa que leia um vetor de inteiros de 10 posições e garanta que todos os
elementos presentes no vetor sejam todos distintos entre si.*/

public class Ex026 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número inteiro: ");
            nums[i] = entrada.nextInt();
            for (int j = 0; j < i; j++) {
                while (nums[i] == nums[j]) {
                    System.out.print("O valor " + nums[i] + " se repete, digite novamente: ");
                    nums[i] = entrada.nextInt();
                    break;
                }
            }
        }

        entrada.close();

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
