package Lista02;

import java.util.Scanner;

/*Escreva um programa que calcule o fatorial de um número inteiro N fornecido pelo
usuário. Cuidado com valores inválidos!*/

public class Ex010 {
    public static void main(String[] args) {
		int n, resultado = 1;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("N: ");
		n = entrada.nextInt();
		while (n < 0) {
			System.out.println("Digite um número >= 0");
			System.out.print("N: ");
			n = entrada.nextInt();
		}
		
		entrada.close();
		

		for (int i = n; i > 0; i--) {
			resultado *= i;
		}


		System.out.println("N!: " + resultado);
	}
}
