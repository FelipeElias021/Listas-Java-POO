package Lista02;

import java.util.Scanner;

/*Faça um algoritmo que receba o salário e um código correspondente ao cargo de um
funcionário e imprima seu cargo, o salário, e o valor do aumento segundo o percentual de
aumento ao qual este funcionário tem direito segundo a tabela a seguir e o valor do
aumento baseado no salário. Ao final, mostre o salário com o aumento.

Obs. O programa deverá informar ao usuário caso ele digite um código inválido.*/

public class Ex007 {
    public static void main(String[] args) {
        int id;
        double salario, percentual = 0;
        String cargo = "";
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Código: ");
            id = entrada.nextInt();
            while (id <= 0 || id >= 6) {
                System.out.println("Os códigos vão de 1 a 5, digite um válido");
                id = entrada.nextInt();
            }

            System.out.print("Salário: ");
            salario = entrada.nextDouble();
        }

        if (id == 1) {
            cargo = "Escrituário";
            percentual = 0.5;
        } else if (id == 2) {
            cargo = "Secretário";
            percentual = 0.35;
        } else if (id == 3) {
            cargo = "Caixa";
            percentual = 0.20;
        } else if (id == 4) {
            cargo = "Gerente";
            percentual = 0.10;
        } else if (id == 5) {
            cargo = "Diretor";
            percentual = 0;
        }

        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Percentual aumento: " + 100 * percentual + "%");
        System.out.println("Valor aumentado: " + salario * percentual);
        System.out.println("Salário aumentado: " + salario * (1 + percentual));
    }
}
