package Lista02;

import java.util.Scanner;

/*Crie um algoritmo que peça a idade do eleitor e o mesmo informe se o eleitor é facultativo
(entre 16 e 17 anos) ou obrigatório (entre 18 a 65) ou dispensado (acima de 65).*/

public class Ex002 {
    public static void main(String[] args) {
        int idade;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Idade do eleitor: ");
            idade = entrada.nextInt();
        }

        System.out.println("Eleitor: " + getEleitor(idade));

    }

    public static String getEleitor(int idade) {
        if (idade < 16) {
            return null;
        } else if (idade < 18) {
            return "Facultativo";
        } else if (idade < 65) {
            return "Obrigatório";
        } else {
            return "Dispensado";
        }
    }
}
