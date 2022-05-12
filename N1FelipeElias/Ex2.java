package N1FelipeElias;

import java.util.Scanner;

/*Dado um polígono convexo de n lados, podemos calcular o número de diagonais diferentes
(nd) desse polígono pela fórmula nd = n(n-3)/2. Faça um programa que leia quantos lados tem o
polígono, calcule e escreva o número de diagonais diferentes (nd) do mesmo.*/

public class Ex2 {
    public static void main(String[] args) {
        int n, nd;
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de lado do polígono convexo: ");
		n = entrada.nextInt();
		while (n < 3) {
			System.out.println("A quantidade de lados deve ser igual ou maior que 3.");
			n = entrada.nextInt();
		}
		
		entrada.close();

        nd = (n*(n-3)) / 2;
        
        System.out.println("Diagonais diferentes de um polígono com " + n + " lados: " + nd);
    }
}
