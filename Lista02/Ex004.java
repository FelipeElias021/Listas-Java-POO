package Lista02;

import java.util.Scanner;

/*Desenvolver um programa que calcule o salário bruto e o salário líquido de um funcionário.
• Dados de Entrada: Matrícula do funcionário (int); Quantidade de horas-extras
trabalhadas.
• Constantes: Salário Mínimo = R$ 788.00; Valor da Hora-Extra = R$ 10.00.
Sabe-se:
• Salário hora-extra = horas-extras * Valor da Hora-Extra;
• Salário bruto = 3 * Salário Mínimo + Salário hora-extra;
• Desconto INSS = 12 % do salário bruto, se salário bruto for maior que R$
1500,00;
• Desconto do Imposto de Renda = 20 % do Salário Bruto, se o mesmo for
maior que R$ 2000,00; • Salário líquido = salário bruto – deduções.
*/

public class Ex004 {
    public static void main(String[] args) {
        int matricula;
        double horasExtras;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Identificação: ");
            matricula = entrada.nextInt();
            System.out.print("Horas Extras: ");
            horasExtras = entrada.nextDouble();
        }

        double salarioLiquido = CalculoSalario(horasExtras);

        System.out.println("# " + matricula + " - " + "Salário Líquido: " + salarioLiquido);

    }

    public static double CalculoSalario(double horas) {
        double salarioMinimo = 788, horaExtra = 10, INSS = 0.12, impostoRenda = 0.2;
        double salarioBruto, descontos = 0;

        int multiplo = 3;

        salarioBruto = multiplo * salarioMinimo + (horas * horaExtra);

        if (salarioBruto > 2000) {
            descontos = salarioBruto * (INSS + impostoRenda);
        } else if (salarioBruto > 1500) {
            descontos = salarioBruto * INSS;
        }

        return salarioBruto - descontos;
    }
}
