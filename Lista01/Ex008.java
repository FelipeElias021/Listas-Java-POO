package Lista01;

import java.util.Scanner;

/*Faça um programa que leia 2 números inteiros A e B. Em seguida realize a troca dos
números, onde o valor da variável B seja colocado em A e vice-versa. Apresente os
valores trocados.
*/

public class Ex008 {
    public static void main(String[] args) {
        int a, b, c;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Primeiro número: ");
            a = entrada.nextInt();
            System.out.print("Segundo número: ");
            b = entrada.nextInt();
        }
        c = a;
        a = b;
        b = c;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
