package Lista01;

import java.util.Scanner;

/*Escreva um programa que pergunte o nome e a idade de um indivíduo e imprima
(aproximadamente) quantos dias de vida ele possui. Considere que o ano tem 365 dias.
*/

public class Ex003 {
    public static void main(String[] args) {
        String nome;
        int idade;

        try (Scanner entrada = new Scanner(System.in)) {
            do {
                System.out.print("Idade: ");
                idade = entrada.nextInt();
            } while (idade < 0);

            entrada.nextLine();
            
            System.out.print("Nome: ");
            nome = entrada.nextLine();
        }   

        System.out.println("Olá " + nome +", você tem aproximadamente " + idade*356 + " dias de vida");
    }
}
