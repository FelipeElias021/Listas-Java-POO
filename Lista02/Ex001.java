package Lista02;

import java.util.Scanner;

/*Crie um programa para determinar se um número inteiro A é divisível por outro número
B. Os valores devem ser fornecidos pelo usuário.*/

public class Ex001 {
    public static void main(String[] args) {
        int a, b;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Dividendo: ");
            a = entrada.nextInt();
            System.out.print("Divisor: ");
            b = entrada.nextInt();
        }

        if (a % b == 0) {
            System.out.println("A é divisível por B");
        } else {
            System.out.println("A não é divisível por B");
        }
    }
}
