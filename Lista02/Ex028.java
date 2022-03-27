package Lista02;

import java.util.Scanner;

/*. Faça um programa que calcule o Arranjo e Combinação de N tomados de P a P, 𝐴𝑛
𝑝
e
𝐶𝑛
𝑝
. Para tal, crie um método que calcule o fatorial de um número. Crie também outros
dois métodos, uma para calcular 𝐴𝑛
𝑝
e outra para calcular 𝐶𝑛
𝑝
conforme as equações
abaixo, e ao final mostre os resultados*/

public class Ex028 {
    public static void main(String[] args) {
        int n, p;
        double arranjo, combinacao;

        System.out.println("Arranjo e Combinação:");

        Scanner entrada = new Scanner(System.in);
		
		System.out.print("N: ");
		n = entrada.nextInt();
		while (n < 0) {
			System.out.println("Digite um número >= 0");
			System.out.print("N: ");
			n = entrada.nextInt();
		}

        System.out.print("P: ");
		p = entrada.nextInt();
		while (p < 0) {
			System.out.println("Digite um número >= 0");
			System.out.print("P: ");
			p = entrada.nextInt();
		}
		
		entrada.close();

        arranjo = Arranjo(n, p);
        combinacao = Combinacao(n, p);

        System.out.println("\nArranjo de " + n + " tomados de " + p + " a " + p + ": " + arranjo);
        System.out.println("Combinação de " + n + " tomados de " + p + " a " + p + ": " + combinacao);

    }

    public static double Arranjo(int n, int p) {
        return (fatorial(n)) / fatorial(n - p);
    } 

    public static double Combinacao(int n, int p) {
        return (fatorial(n)) / (fatorial(p) * fatorial(n - p));
    } 

    public static int fatorial(int num) {
        int resultado = 1;

        for (int i = num; i > 0; i--) {
			resultado *= i;
		}

        return resultado;
    }
}
