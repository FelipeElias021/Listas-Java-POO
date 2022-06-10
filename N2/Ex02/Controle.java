package N2.Ex02;

import java.util.Scanner;

import N2.Ex02.Entidades.*;

public class Controle {
    static Scanner e = new Scanner(System.in);
    public static void main(String[] args) {
        double raio = getNumeroPositivo("\nRaio do Círculo: ");
        Circulo c1 = new Circulo(raio);

        double lado = getNumeroPositivo("\nLado do Quadrado: ");
        Quadrado q1 = new Quadrado(lado);

        double base = getNumeroPositivo("\nBase do Retângulo: ");
        double altura = getNumeroPositivo("\nAltura do Retângulo: ");
        Retangulo r1 = new Retangulo(base, altura);

        c1.exibirDados();
        q1.exibirDados();
        r1.exibirDados();
    }

    static double getNumeroPositivo(String frase) {
        System.out.print(frase);
        double tipo = e.nextDouble();
        while (tipo < 0) {
            System.out.println("O valor precisa ser positivo!");
            System.out.println("Tente novamente.");
            tipo = e.nextDouble();
        }
        return tipo;
    }
}
