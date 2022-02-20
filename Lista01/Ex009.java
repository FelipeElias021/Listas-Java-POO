package Lista01;

import java.util.Scanner;

/* Faça um algoritmo que leia o RAIO (R) e calcule a ÁREA e o PERÍMETRO de uma
esfera. Area = πR² e Perimetro = 2πR. Considere π = Math.PI.
*/

public class Ex009 {
    public static void main(String[] args) {
        double raio, perimetro, area;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Raio: ");
            raio = entrada.nextInt();
        }

        area = Math.PI * Math.pow(raio, 2);
        perimetro = 2 * Math.PI * raio;

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
