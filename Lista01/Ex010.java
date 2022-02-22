package Lista01;

import java.util.Scanner;

/* Faça um algoritmo que leia x e y e resolva a equação abaixo:
Eq = 2 * (V3x+30/3) + (y-32)^4
*/

public class Ex010 {
    public static void main(String[] args) {
        double x, y, resultado;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("X: ");
            x = entrada.nextDouble();
            System.out.print("Y: ");
            y = entrada.nextDouble();
        }

        resultado = (2 * (Math.sqrt((3 * x) + 30)/3)) + (Math.pow(y-32, 4));

        System.out.println("Resultado: " + resultado);
    }
}
