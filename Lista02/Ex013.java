package Lista02;

import java.util.Scanner;

/*Faça um programa que leia uma senha (número inteiro). Em seguida, pergunte ao usuário
a senha informada, caso a senha esteja errada imprima “Senha incorreta, tente
novamente” e leia novamente a senha. Caso o usuário digite a senha correta, imprima
“Senha correta! Bem-vindo ao sistema”.*/

public class Ex013 {
    public static void main(String[] args) {
        int senha, confirmacaoSenha;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Senha: ");
        senha = entrada.nextInt();

        System.out.print("Confirme a senha: ");
        confirmacaoSenha = entrada.nextInt();

        while (senha != confirmacaoSenha) {
            System.out.println("Senha incorreta, tente novamente");
            System.out.print("Confirme a senha: ");
            confirmacaoSenha = entrada.nextInt();
        }

        entrada.close();

        System.out.println("Senha correta! Bem-vindo ao sistema");
    }
}
