package Lista02;

import java.util.Scanner;

/* Escreva um programa que receba dois números x e y e calcule x^y.
Sem utilizar a biblioteca Math.
*/

public class Ex009 {
    public static void main(String[] args) {
        double x, y, resultado = 1;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Base: ");
		x = entrada.nextDouble();
		System.out.print("Expoente: ");
		y = entrada.nextDouble();
		entrada.close();
		
		for (int i = 0; i < y; i++) {
			resultado *= x;
		}

		System.out.println("x elevado a y: " + resultado);
    }
}
