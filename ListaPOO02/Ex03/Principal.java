package ListaPOO02.Ex03;

import java.util.ArrayList;
import java.util.Scanner;

import ListaPOO02.Ex03.Entidade.*;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        Compra compra = new Compra();

        produtos.add(new Produto(1, "Mouse Death Essential V2"));
        produtos.add(new Produto(2, "Monitor Ace 180Hz"));
        
        System.out.println("Faça o cadastro:");
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Logradouro: ");
        String logradouro = entrada.nextLine();
        System.out.print("Cidade: ");
        String cidade = entrada.nextLine();
        System.out.print("Estado: ");
        String estado = entrada.nextLine();

        Pessoa user = new Pessoa(nome, "1", new Endereco(logradouro, cidade, estado));
    
        System.out.println("\n----------------\nSelecione o código do Produto que deseja comprar:");
        for (Produto p : produtos) {
            System.out.println(p.toString());
        }
        int opc = entrada.nextInt();

        entrada.close();

        compra.Comprar(user, produtos.stream()
        .filter(x -> opc == x.getCodigo())
        .findAny()
        .get());

        System.out.println(compra.VerificarCompra());
    }
}
