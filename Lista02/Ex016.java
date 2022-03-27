package Lista02;

import java.util.Scanner;

/*Faça um programa que leia um numero inteiro N e mostre todos os números primos entre
1 e N. Número primo é aquele que é divisível apenas por 1 e ele mesmo.
Ex. 17 é um número primo, pois só é divisível por 1 e por ele mesmo.
*/

public class Ex016 {
    public static void main(String[] args) {
        int N, count = 0;

        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Digite um número inteiro: ");
        N = entrada.nextInt();

        entrada.close();

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("O número " + N + " é primo");
        } else {
            System.out.println("O número " + N + " NÃO é primo");
        }
    }
}
