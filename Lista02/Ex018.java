package Lista02;

import java.util.Random;
import java.util.Scanner;

/*Desenhe a seguinte pirâmide de asteriscos. O usuário deve determinar a quantidade de
linhas.
*
**
***
****
...
*/

public class Ex018 {
    public static void main(String[] args) {
        int linhas;
        char[] preenchimento = {'*', '$', '%', '§', '&', '£'};

        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Número de linhas: ");
        linhas = entrada.nextInt();
        while (linhas < 0) {
            System.out.print("Digite um número não negativo: ");
            linhas = entrada.nextInt();
        }

        entrada.close();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                Random rand = new Random();
                int int_rand = rand.nextInt(preenchimento.length);
                System.out.print(preenchimento[int_rand] + " ");
            }
            System.out.println();
        }
    }
}
