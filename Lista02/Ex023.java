package Lista02;

import java.util.Scanner;

/*Faça um programa que leia um primeiro vetor com dez números inteiros e um segundo
vetor com cinco números inteiros. Mostre uma lista dos números do primeiro vetor com
seus respectivos divisores armazenados no segundo vetor, bem como suas posições.
Ex.:
Num [ 5 12 4 7 10 3 2 6 23 16 ]
Divis [ 3 11 5 8 2]
Saída:
Número 5:
Divisível por 5 na posição 2
Número 12:
Divisível por 3 na posição 0
Divisível por 2 na posição 4
Número 4:
Divisível por 2 na posição 4
. . .
*/

public class Ex023 {
    public static void main(String[] args) {
        int[] nums1 = new int[10];
        int[] nums2 = new int[5];

        Scanner entrada = new Scanner(System.in);
    
        for (int i = 0; i < nums1.length; i++) {
            System.out.print("Digite um número inteiro: ");
            nums1[i] = entrada.nextInt();
        }
        System.out.println();
        for (int i = 0; i < nums2.length; i++) {
            System.out.print("Digite um divisor inteiro: ");
            nums2[i] = entrada.nextInt();
        }
        
        entrada.close();

        for (int i = 0; i < nums1.length; i++) {
            System.out.println("\nNúmero: " + nums1[i]);
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % nums2[j] == 0) {
                    System.out.println("Divisível por " + nums2[j] + " na posição " + j);
                }
            }
        }
    }
}
