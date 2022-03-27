package Lista02;

import java.util.Scanner;

/*Faça um programa que leia um código, x e y e calcule f(x,y) de acordo com as equações
abaixo:
Código Equação
1  𝑓(𝑥, 𝑦) = √𝑥^3 + ((𝑥(2𝑦 − 𝑥)) / 𝑦^2)
2 𝑓(𝑥, 𝑦) = √((𝑥^3 + 𝑦^3) + (𝑥^3 − 𝑦^3)) / 𝑥 ∗ 𝑦
3 𝑓(𝑥, 𝑦) = 2𝑥 + √𝑥 ∗ 𝑦
4 𝑓(𝑥, 𝑦) = sin(𝑥) + cos(𝑦)
*Obs. Cuidado com operações inválidas!*/

public class Ex008 {
    public static void main(String[] args) {
        double x, y, resposta;

        Scanner entrada = new Scanner(System.in);
        System.out.print("X: ");
        x = entrada.nextDouble();
        System.out.print("Y: ");
        y = entrada.nextDouble();

        entrada.close();

        resposta = Math.sqrt(Math.pow(x, 3) + (x * (2*y - x)) / Math.pow(y, 2));
        System.out.println("01) : " + resposta);

        resposta = Math.sqrt((Math.pow(x, 3) + Math.pow(y, 3))  + (Math.pow(x, 3) - Math.pow(y, 3))) / x * y;
        System.out.println("02) : " + resposta);

        resposta = 2*x + Math.sqrt(x*y);
        System.out.println("03) : " + resposta);

        resposta = Math.sin(x) + Math.cos(y);
        System.out.println("04) : " + resposta);
    }
}
