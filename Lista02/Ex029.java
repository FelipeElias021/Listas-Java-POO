package Lista02;

import java.util.Random;
import java.util.Scanner;

/*. Utilize o método sorteia que retorna um número aleatório de limiteInferior até
limiteSuperior para gerar um número aleatório neste intervalo. O número gerado pelo
sorteia deverá ser colocado em um vetor de 1000 posições. Leia limiteInferior e
limiteSuperior e preencha o vetor de 1000 posições, garantindo que todos os valores
presentes no vetor são distintos entre si.*/

public class Ex029 {
    public static void main(String[] args) {
        int limiteInf, limiteSup;
        int[] vetor = new int[1000];
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Defina o limite inferior: ");
        limiteInf = entrada.nextInt();

        System.out.print("Defina o limite superior: ");
        limiteSup = entrada.nextInt();
        while (limiteSup < limiteInf || limiteSup - limiteInf < vetor.length) {
            System.out.print("O limite superior deve ser 1000 casas a mais que o inferior: ");
            limiteSup = entrada.nextInt();
        }

        
        entrada.close();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sorteia(limiteInf, limiteSup);
            for (int j = 0; j < i; j++) {
                while (vetor[i] == vetor[j]) {
                    vetor[i] = sorteia(limiteInf, limiteSup);
                    break;
                }
            }

            System.err.print(vetor[i] + "\t ");
        }
    }

    public static int sorteia (int limiteinf, int limitesup) {
        Random rand = new Random();
        return rand.nextInt(limitesup - limiteinf + 1) + limiteinf;
    }
}
