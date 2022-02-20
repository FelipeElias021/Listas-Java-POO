package Lista01;

import java.util.Scanner;

/*. Escreva um programa que leia dois números inteiros e imprima a seguinte saída, com os
valores calculados, sabendo que o primeiro número informado será o dividendo e o
segundo, o divisor:
Dividendo =
Divisor =
Quociente =
Resto =
*Obs. Para obter o resto de uma divisão utilize o operador %.
*/

public class Ex002 {
    public static void main(String[] args) {
        int num1, num2;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Primeiro núemero: ");
            num1 = entrada.nextInt();
            do {
                System.out.print("Segundo número: ");
                num2 = entrada.nextInt();
            } while (num2 == 0);
        }

        System.out.print("\nDividendo: " + num1);
        System.out.print("\nDivisor: " + num2);
        System.out.print("\nQuociente: " + num1/num2);
        System.out.print("\nResto: " + num1%num2);
    }
}
