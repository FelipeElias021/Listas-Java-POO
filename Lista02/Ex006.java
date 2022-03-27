package Lista02;

import java.util.Scanner;

/*Escreva um algoritmo que leia o código de um determinado produto e mostre a sua
classificação de acordo com a tabela apresentada a seguir:

Código          Classficação
1               Alimento não perecível
2, 3, 4         Alimento perecível
5, 6            Vestuário
7               Higiene Pessoal
8 até 15        Limpeza e utensílio domésticos
*               Inválido
*/

public class Ex006 {
    public static void main(String[] args) {
        int id;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Identificação: ");
            id = entrada.nextInt();
        }

        System.out.println(getClassificacaoProduto(id));
    }

    public static String getClassificacaoProduto(int id) {
        if (id == 1) {
            return "Alimento não perecível";
        } else if (id >= 2 && id <= 4) {
            return "Alimento perecível";
        } else if (id >= 5 && id <= 6) {
            return "Vestuário";
        } else if (id == 7) {
            return "Higiene Pessoal";
        } else if (id >= 8 && id <= 15) {
            return "Limpeza e utensílio domésticos";
        } else {
            return "Inválido";
        }
    }
}
