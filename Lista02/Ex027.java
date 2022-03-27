package Lista02;

import java.util.Random;
import java.util.Scanner;

/*Crie 2 vetores de inteiros A e B de tamanho 10 preenchidos aleatoriamente. Para tal,
utilize método: int sorteia (int limitInf, int limitSup) descrito abaixo que recebe por
parâmetro os limites inferior e superior dos valores gerados, tais limites deverão ser
informados pelo usuário (valide para que o limitInf seja menor que o limitSup), e retorne
um número neste intervalo. Em seguida crie vetores auxiliares que sejam preenchidos
pelos:
a. O vetor Soma deverá ser preenchido pela soma dos elementos de A e B.
Ex. A{1, 5} B{3, 4} Soma {4, 9}.

b. O vetor Intersecção deverá ser preenchido com os valores que estão em A
e B ao mesmo tempo. Ex. A{1, 5}, B{3, 5}, Interseccao{5}.

c. O vetor Diferença deverá ser preenchido com valores que estão em A mas
não estão em B. Ex. A{1, 5}, B{3, 5}, Diferenca{1}.

d. O vetor Intercalação deverá ser preenchido com a intercalação dos vetores
A e B. Ex. A {1, 5} e B {3, 4} Intercalacao {1, 3, 5, 4}. */

public class Ex027 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int limiteInf, limiteSup;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Defina o limite inferior: ");
        limiteInf = entrada.nextInt();

        System.out.print("Defina o limite superior: ");
        limiteSup = entrada.nextInt();
        while (limiteSup < limiteInf) {
            System.out.print("O limite superior deve ser maior que o inferior: ");
            limiteSup = entrada.nextInt();
        }

        
        entrada.close();
        
        for (int i = 0; i < a.length; i++) {
            a[i] = sorteia(limiteInf, limiteSup);
            b[i] = sorteia(limiteInf, limiteSup);
        }
        System.out.print("\nA: { ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nB: { ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        A(a, b);
        B(a, b);
        C(a, b);
        D(a, b);

    }

    public static int sorteia (int limiteinf, int limitesup) {
        Random rand = new Random();
        return rand.nextInt(limitesup - limiteinf + 1) + limiteinf;
    }

    public static void A (int[] a, int[] b) {
        int[] soma = new int[10];

        System.out.print("\nSoma: { ");
        for (int i = 0; i < soma.length; i++) {
            soma[i] = a[i] + b[i];
            System.out.print(soma[i] + " ");
        }
    }

    public static void B (int[] a, int[] b) {
        int[] interseccao = new int[10];
        int k = 0;

        for (int i = 0; i < interseccao.length; i++) {
            for (int j = 0; j < interseccao.length; j++) {
                if (a[i] == b[j]) {
                    interseccao[k] = a[i];
                    k++;
                    break;
                }
            }
        }

        System.out.print("\nIntersecção: { ");
        for (int i = 0; i < interseccao.length; i++) {
            System.out.print(interseccao[i] + " ");
        }
    }

    public static void C (int[] a, int[] b) {
        int[] diferenca = new int[10];
        int k, l = 0;

        for (int i = 0; i < diferenca.length; i++) {
            k = 0;

            for (int j = 0; j < diferenca.length; j++) {
                if (a[i] != b[j]) {
                    k++;
                }
            }

            if (k == diferenca.length) {
                diferenca[l] = a[i];
                l++;
            }
        }

        System.out.print("\nDiferenca: { ");
        for (int i = 0; i < diferenca.length; i++) {
            System.out.print(diferenca[i] + " ");
        }
    }

    public static void D(int[] a, int[] b) {
        int[] intercalacao = new int[20];
        int j = 0;

        for (int i = 0; i < intercalacao.length; i++) {
            if (i % 2 == 0) {
                intercalacao[i] = a[j];
            } else {
                intercalacao[i] = b[j];
                j++;
            }
        }

        System.out.print("\nIntercalação: { ");
        for (int i = 0; i < intercalacao.length; i++) {
            System.out.print(intercalacao[i] + " ");
        }
    }
}
