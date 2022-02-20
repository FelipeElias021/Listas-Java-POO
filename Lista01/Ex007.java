package Lista01;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/*Uma Progressão Aritmética (P.A) é determinada pela sua razão (r) e pelo seu primeiro
termo (a1). Escreva um programa que determine o n-ésimo termo de uma P.A utilizando
a fórmula abaixo. Para tal, leia o primeiro termo, a razão e o valor de n que representa o
índice do n-ésimo termo. Ao final, imprima o valor da P.A de n (a n).
*/

public class Ex007 {
    public static void main(String[] args) {
        int a1, r, n;
        List<Integer> progressao = new ArrayList<Integer>();

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Primeiro termo: ");
            a1 = entrada.nextInt();
            System.out.print("Razão: ");
            r = entrada.nextInt();
            System.out.print("Índice do n-ésimo termo: ");
            n = entrada.nextInt();
        }

        for (int i = 0; i < n; i++) {
            progressao.add(a1 + i*r);
        }

        for (Integer integer : progressao) {
            System.out.print(integer + " ");
        }
    }
}
