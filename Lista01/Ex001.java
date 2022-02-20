package Lista01;

import java.util.Scanner;

/*Faça um programa que leia o nome e sobrenome de duas pessoas (marido e esposa) e um
ano (inteiro). E exiba a seguinte mensagem: “Fulano da Silva é casado com Ciclana de
Souza há XX anos”. Considere o ano atual como 2018.*/

public class Ex001 {
    public static void main(String[] args) {
        String nomeCompletoMarido, nomeCompletoEsposa, nome, sobrenome;
        int anoCasamento, anoAtual = 2022;

        try (Scanner entrada = new Scanner(System.in)) {
            do {
                System.out.print("Ano do casamento: ");
                anoCasamento = entrada.nextInt();
            } while (anoCasamento > anoAtual);

            entrada.nextLine();

            System.out.print("Primeiro nome do Marido: ");
            nome = entrada.nextLine();
            System.out.print("Sobrenome do(a) do Marido: ");
            sobrenome = entrada.nextLine();
            nomeCompletoMarido = nome + " " + sobrenome;

            System.out.print("Primeiro nome da Esposa: ");
            nome = entrada.nextLine();
            System.out.print("Sobrenome do(a) da Esposa: ");
            sobrenome = entrada.nextLine();
            nomeCompletoEsposa = nome + " " + sobrenome;
        }   

        System.out.println(nomeCompletoMarido + " é casado com " + nomeCompletoEsposa + " há " + (anoAtual - anoCasamento) + " anos");
    }
}