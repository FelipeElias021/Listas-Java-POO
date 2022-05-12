package ListaPOO01.Ex005;

/*Escreva uma classe em Java chamada Estoque. Ela deverá possuir:
a) os atributos nome (String), qtdAtual (int) e qtdMinima (int).
b) um construtor sem parâmetros e um outro contendo os parâmetros nome, qtdAtual, e
qtdMinima.
c) os métodos com as seguintes assinaturas:
• void mudarNome(String nome)
• void mudarQtdMinima(int qtdMinima)
• void repor(int qtd)
• void darBaixa(int qtd)
• String mostra()
• boolean precisaRepor()
Valide para que os atributos qtdAtual e qtdMinima jamais poderão ser negativos.
O método repor aumenta qtdAtual de acordo com o parâmetro qtd. O método darBaixa
diminui qtdAtual de acordo com o parâmetro qtd. O método mostra() retorna uma String
contendo o nome do produto, sua quantidade mínima, sua quantidade atual. O método
precisaRepor retorna true caso a quantidade atual esteja menor ou igual à quantidade
mínima e false, caso contrário.
Em seguida, escreva uma classe PrincipalEstoque cujo método main instancia os 3
objetos a seguir:
Depois disso, execute as seguintes operações na seguinte ordem:
a) Dar baixa em 5 unidades de estoque1.
b) Fazer a reposição de 7 unidades de estoque2.
    Lista POO 1
DATA:
CURSO: Sistemas de Informação NOTA:
DISCIPLINA: Programação Orientada a Objetos
PROFESSOR: Luiz Mário Lustosa Pascoal
ALUNO:
c) Dar baixa em 4 unidades de estoque3.
d) Exibir a saída do método precisaRepor dos 3 objetos.
e) Exibir a saída do método mostra para apresentar as informações sobre os 3 objetos*/

public class PrincipalEstoque {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);
        Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
        Estoque estoque3 = new Estoque("Mouse Ótico", 6, 2);
    
        System.out.println(estoque1.mostra() + "\n");
        System.out.println(estoque2.mostra() + "\n");
        System.out.println(estoque3.mostra() + "\n");

        estoque1.darBaixa(5);

        estoque2.repor(7);

        estoque3.darBaixa(4);

        System.out.println("\nEstoque 1: " + estoque1.precisaRepor() + "\n");
        System.out.println("Estoque 2: " + estoque2.precisaRepor() + "\n");
        System.out.println("Estoque 3: " + estoque3.precisaRepor() + "\n");
        System.out.println(estoque1.mostra() + "\n");
        System.out.println(estoque2.mostra() + "\n");
        System.out.println(estoque3.mostra() + "\n");
    }
}
