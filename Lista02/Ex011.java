package Lista02;

import java.util.Scanner;

/*Escrever um programa que calcule todos os números inteiros divisíveis por um certo valor
indicado pelo usuário, e compreendidos em um intervalo também especificado pelo
usuário. O usuário deve entrar com um primeiro valor correspondente ao divisor e após
ele vai fornecer o valor inicial do intervalo, seguido do valor final deste intervalo.
Exemplo: Valor do divisor: 3;
Inicio do Intervalo: 17;
Fim do Intervalo: 29;
Saída-> Números divisíveis por 3 no intervalo de 17 a 29: 18, 21, 24, 27.*/

public class Ex011 {
    public static void main(String[] args) {
		int num, inicio, fim;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Divisor: ");
		num = entrada.nextInt();
		System.out.print("Início: ");
		inicio = entrada.nextInt();
		System.out.print("Fim: ");
		fim = entrada.nextInt();
		
		entrada.close();
		
        System.out.print("Números divisíveis por " + num + " no intervalo de " + inicio + " a " + fim + ": ");

		for (int i = inicio; i <= fim; i++) {
			if (i % num == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
