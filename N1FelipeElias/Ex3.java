package N1FelipeElias;

import java.util.Scanner;

/*Considere um ponto P(x0, y0) e uma reta s de equação s: ax + by + c = 0. Faça um
programa que leia as coordenadas de P e os coeficientes da reta s e calcule a distância
entre P e s, dada através da fórmula abaixo:
D(P, s) = |ax0 + by0 + c|
        ------------------
            √(a^2 + b^2)
*/


public class Ex3 {
    public static void main(String[] args) {
        double px, py, a, b, c, distancia, numerador;

        Scanner entrada = new Scanner(System.in);
		
        System.out.println("Digite as coordenadas de P(x, y):");
		System.out.print("X: ");
		px = entrada.nextDouble();
        System.out.print("Y: ");
		py = entrada.nextDouble();

        System.out.println("Digite os coeficientes de S: ax + by + c = 0 :");
		System.out.print("a: ");
		a = entrada.nextDouble();
        System.out.print("b: ");
		b = entrada.nextDouble();
        System.out.print("c: ");
		c = entrada.nextDouble();
		
		entrada.close();

        numerador = (a * px) + (b * py) + c;
        
        if (numerador < 0) {
            numerador *= -1;
        }

        distancia = numerador / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Distância do Ponto P( " + px + ", " + py + " ) e da reta s: " + a + "x + " + b + "y + " + c + " = 0 : " + distancia);
    }
}
