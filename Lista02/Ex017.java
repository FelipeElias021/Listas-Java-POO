package Lista02;

import java.util.Scanner;

/* Faça um programa que leia o código dos produtos pedidos e as quantidades desejadas;
calcule e mostre o valor a ser pago por produto (preço * quantidade) e o total do pedido.
Considere que o cliente deve informar quando o pedido deve ser encerrado*/

public class Ex017 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        double saldo = 0, valor, preco = 0;
        int qntItens;

        do {
            Menu();
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("\n> Cachorro Quente");
                    preco = 1.5;
                    break;
                case 2:
                    System.out.println("\n> Hamburguer");
                    preco = 2.0;
                    break;
                case 3:
                    System.out.println("\n> Cheeseburguer");
                    preco = 2.5;
                    break;
                case 4:
                    System.out.println("\n> Eggcheeseburguer");
                    preco = 3.0;
                    break;
                case 5:
                    System.out.println("\n> Refrigerante");
                    preco = 1.5;
                    break;
                case 0:
                    System.out.println("\nGarçom, traz a conta!");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }

            if (opc == 1 || opc == 2 || opc == 3 || opc == 4 || opc == 5) {
                qntItens = retornaQuantidade();
                valor = qntItens * preco;
                saldo += valor;
            }

        } while (opc != 0);

        System.out.println("Valor a ser pago: ETC " + saldo);
    }

    public static void Menu() {

        System.out.println("Produto\t\t\t Código \t\tPreço Unitário");
        System.out.println("Cachorro Quente\t\t 1 \t\t 1.50 ETC");
        System.out.println("Hamburguer\t\t 2 \t\t 2.00 ETC");
        System.out.println("Cheeseburguer\t\t 3 \t\t 2.50 ETC");
        System.out.println("Eggcheeseburguer\t 4 \t\t 3.00 ETC");
        System.out.println("Refrigerante\t\t 5 \t\t 1.50 ETC");
        System.out.println("Sair\t\t\t 0");
        System.out.print("\nInforme a opção desejada: ");
    }

    public static int retornaQuantidade() {
        System.out.print("Informe a quantidade: ");
        int qntd = entrada.nextInt();

        return qntd;
    }
}
