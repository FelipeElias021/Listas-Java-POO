package Lista01;

import java.util.Scanner;

/*Uma loja resolveu realizar uma promoção de seus produtos oferecendo um desconto
variável em % informado pelo vendedor. Escreva um programa que leia o valor original
do produto e o valor do desconto oferecido pelo vendedor e imprima o novo valor do
produto.*/

public class Ex005 {
    public static void main(String[] args) {
        double preco, desconto, valorDesconto;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Valor do Protudo: ETC ");
            preco = entrada.nextDouble();
            do {
                System.out.print("Desconto: ETC ");
                desconto = entrada.nextDouble();
            } while (desconto > preco);
        }  

        valorDesconto = preco - desconto;

        System.out.println("Valor com desconto: ETC " + valorDesconto);
    }
}
