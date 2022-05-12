package ListaPOO01.Ex001;

import java.util.Scanner;

public class FuncionarioTeste {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor das vendas do Funcionário: ");
        double vendas = entrada.nextDouble();
        while (vendas < 0) {
            System.out.print("Digite um número não negativo: ");
            vendas = entrada.nextDouble();
        }

        entrada.close();
    
        double salario = funcionario.calculaSalario(vendas);

        System.out.print("Valor do salário do funcionário: " + salario);
    }
}
