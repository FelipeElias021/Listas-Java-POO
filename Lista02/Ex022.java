package Lista02;

import java.util.Scanner;

/*Faça um programa que preencha um vetor com 10 números inteiros. Calcule e mostre a
quantidade de números superiores a 25 e suas respectivas posições. O programa deverá
mostrar uma mensagem se não existir nenhum número nessa condição.*/

public class Ex022 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int base = 25, count = 0;

        Scanner entrada = new Scanner(System.in);
    
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número inteiro: ");
            nums[i] = entrada.nextInt();
        }
        
        entrada.close();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > base) {
                System.out.println("Número [" + i + "]: " + nums[i]);
                count++;
            }
        }
        if (count == 0 ) {
            System.out.println("Não há nenhum número maior que " + base);
        }

    }
}
