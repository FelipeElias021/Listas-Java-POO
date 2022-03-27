package Lista02;

import java.util.Scanner;

/*Faça um programa que leia um vetor de inteiros, de 10 posições. A seguir, encontre o
menor elemento (X) e o maior elemento (Y) do vetor. Imprima uma mensagem
mostrando: “O menor elemento do vetor é”, X, “e sua posição dentro do vetor é: V[x]. Já
o maior elemento é “, Y,” e está na posição V[y]”. Assuma que os elementos informados
no vetor são todos diferentes entre si.*/

public class Ex020 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        Scanner entrada = new Scanner(System.in);
    
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número inteiro: ");
            nums[i] = entrada.nextInt();
        }
        
        entrada.close();

        getMaior(nums);
        getMenor(nums);

    }

    public static void getMaior (int[] vetor) {
        int maior = vetor[0], maiorI = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                maiorI = i;
            }
        }

        System.out.println("O maior elemento é " + maior + " e está na posição V[" + maiorI + "]");
    }

    public static void getMenor (int[] vetor) {
        int menor = vetor[0], menorI = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                menorI = i;
            }
        }

        System.out.println("O maior elemento é " + menor + " e está na posição V[" + menorI + "]");
    }

}
