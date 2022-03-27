package Lista02;

import java.util.Scanner;

/*Escreva um programa que apresente quatro opções: (a) consulta saldo, (b) saque e
(c)depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o valor
do saldo deve ser atualizado.
Exemplo:
16. Faça um programa que leia um numero inteiro N e mostre todos os números primos entre
1 e N. Número primo é aquele que é divisível apenas por 1 e ele mesmo.
Ex. 17 é um número primo, pois só*/

public class Ex015 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double saldo = 0, valor;
        char opc;

        do {
            menu();
            opc = entrada.next().charAt(0);

            switch (opc) {
                case 'a':
                case 'A':
                    System.out.println("\nSaldo: " + saldo);
                    break;
                case 'b':
                case 'B':
                    System.out.print("\nValor do Saque: ");
                    valor = entrada.nextDouble();
                    while (valor < 0 || valor > saldo) {
                        System.out.println("O valor para saque deve ser menor que seu saldo e positivo: ");
                        valor = entrada.nextDouble();
                    }
                    saldo -= valor;
                    System.out.println("Novo Saldo: " + saldo);
                    break;
                case 'c':
                case 'C':
                    System.out.print("\nValor do Depósito: ");
                    valor = entrada.nextDouble();
                    while (valor < 0) {
                        System.out.println("O valor do depósito deve ser positivo: ");
                        valor = entrada.nextDouble();
                    }
                    saldo += valor;
                    System.out.println("Novo Saldo: " + saldo);
                    break;
                case 'd':
                case 'D':
                    System.out.println("\nSaindo");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opc != 'd' && opc != 'D');

        entrada.close();
    }

    public static void menu() {
        System.out.println("\nOpções");
        System.out.println("> a. Consulta Saldo");
        System.out.println("> b. Saque");
        System.out.println("> c. Depósito");
        System.out.println("> d. Sair");
        System.out.print("Digite a opção desejada: ");
    }
}
