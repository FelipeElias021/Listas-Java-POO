package Lista02;

import java.util.Scanner;

/*Faça um programa que Leia o Nome e duas notas de uma pessoa e ao final, o programa
deve calcular a média aritmética entre as duas notas. O programa deve ser capaz de validar
se a nota informada é válida (0.0 ≤ nota ≤ 10), caso contrário o sistema deve informar ao
usuário o erro e pedir para ler novamente. Usar um laço Faça-Enquanto na leitura das
notas, e gerar uma saída conforme o exemplo de tela de saída abaixo:.*/

public class Ex012 {
    public static void main(String[] args) {
		double nota[] = new double[2], media, soma = 0;
		char continuar;
		String nome;
		
		Scanner entrada = new Scanner(System.in);
		
		do{
			
            System.out.print("Nome do aluno: ");
			nome = entrada.next();

			for (int i = 0; i < nota.length; i++) {
				System.out.print("Nota " + (i+1) + " : ");
				nota[i] = entrada.nextDouble();
				while (nota[i] < 0 || nota[i] > 10) {
					System.out.println("Nota Inváida, digite novamente!");
					System.out.print("Nota " + (i+1) + " : ");
					nota[i] = entrada.nextDouble();
				}
				soma += nota[i];
			}
			
			media = soma / nota.length;
			
			System.out.println("O aluno " + nome + " tem uma media de " + media);
			
			
			System.out.print("Continuar? (S/N)");
			continuar = entrada.next().charAt(0);
			while (continuar != 'S' && continuar != 'N') {
				System.out.println("Resposta " + continuar + " Inválida, digite novamente!");
				System.out.print("Continuar? (S/N)");
				continuar = entrada.next().charAt(0);
			}
		} while(continuar == 'S');
		entrada.close();
	}
}
