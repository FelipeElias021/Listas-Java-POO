package Lista01;

import java.util.Scanner;

/* Dados os pontos A e B, cujas coordenadas reais A(x1, y1) e B(x2, y2) serão informadas  
via teclado, escreva um programa que  calcule a distância euclidiana entre A e B, onde: :
DistanciaEuclidiana = V(y2 - y1)^2 + (x2 - x1)^2
*/

public class Ex011 {
    public static void main(String[] args) {
        double x1, y1, x2, y2;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("X do ponto A: ");
            x1 = entrada.nextDouble();
            System.out.print("Y do ponto A: ");
            y1 = entrada.nextDouble();
            System.out.print("X do ponto B: ");
            x2 = entrada.nextDouble();
            System.out.print("Y do ponto B: ");
            y2 = entrada.nextDouble();
        }

        //distanciaRaiz = Math.pow(y2-y1, 2) + Math.pow(x2-x1, 2);
        double distancia = Math.sqrt(Math.pow(y2-y1, 2) + Math.pow(x2-x1, 2));

        System.out.println("Distância: " + distancia);
    }
}
