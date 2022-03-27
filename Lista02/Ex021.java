package Lista02;

import java.util.Scanner;

/*Escreva um programa que receba quinze números inteiros e armazene em um vetor a raiz
quadrada de cada número. Caso o valor digitado seja menor do que zero, o número -1
deve ser atribuído ao elemento do vetor. Após isso, imprima todos os valores
armazenados.*/

public class Ex021 {
    public static void main(String[] args) {
        int[] nums = new int[15];
        double[] raiz = new double[15];

        Scanner entrada = new Scanner(System.in);
    
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número inteiro: ");
            nums[i] = entrada.nextInt();
        }
        
        entrada.close();

        for (int i = 0; i < raiz.length; i++) {
            if  (nums[i] > 0) {
                raiz[i] = Math.sqrt(nums[i]);
            } else {
                raiz[i] = -1;
            }
            System.out.println("Raiz(" + nums[i] + "):\t" + raiz[i]);
        }
    }
}
