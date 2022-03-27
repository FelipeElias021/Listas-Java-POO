package Lista02;

import java.util.Scanner;

/*Escreva um programa que leia o valor da compra e imprima o valor da venda de acordo com a
tabela a seguir. Cuidado com valor inválido de compra: */

public class Ex003 {
    public static void main(String args[]) {
        double valorCompra;
        try (Scanner entrada = new Scanner(System.in)) {
            do {
                System.out.print("Valor da compra: ");
                valorCompra = entrada.nextDouble();
            } while (valorCompra < 0);
        }

        System.out.println("Valor de venda: " + getValorVenda(valorCompra));
    }

    public static double getValorVenda(double valorCompra) {
        if (valorCompra < 10) {
            return valorCompra * 1.7;
        } else if (valorCompra < 30) {
            return valorCompra * 1.5;
        } else if (valorCompra < 50) {
            return valorCompra * 1.4;
        } else {
            return valorCompra * 1.3;
        }
    }

}
