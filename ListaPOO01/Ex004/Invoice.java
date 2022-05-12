package ListaPOO01.Ex004;

/*Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de
informática para representar uma fatura de um item vendido na loja. Uma fatura deve
incluir as seguintes informações como atributos:
a. o número do item faturado,
b. a descrição do item,

Lista POO 1
DATA:
CURSO: Sistemas de Informação NOTA:
DISCIPLINA: Programação Orientada a Objetos
PROFESSOR: Luiz Mário Lustosa Pascoal
ALUNO:
c. a quantidade comprada do item e
d. o preço unitário do item.

Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não
for positiva, ela deve ser configurada como 0. Se o preço por item não for positivo ele
deve ser configurado como 0.0. Forneça um método set e um método get para cada
variável de instância. Além disso, forneça um método chamado getInvoiceAmount que
calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por item) e depois
retorna o valor como um double. Escreva um aplicativo de teste que demonstra as
capacidades da classe Invoice.*/

public class Invoice {
    private int id;
    private String desc;
    private int qtd;
    private double precoUni;

    public Invoice(int id, String desc, int qtd, double precoUni) {
        this.id = id;
        this.desc = desc;
        this.qtd = qtd;
        if (qtd < 0) {
            this.qtd = 0;
        }
        this.precoUni =precoUni;
        if (precoUni < 0) {
            this.precoUni = 0;
        }
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getDescricao () {
        return desc;
    }

    public void setDescricao (String desc) {
        this.desc = desc;
    }

    public int getQuantidade () {
        return qtd;
    }

    public void setQuantidade (int qtd) {
        this.qtd = qtd;
    }

    public double getPrecoUnitario () {
        return precoUni;
    }

    public void setPrecoUnitario (double precoUni) {
        this.precoUni = precoUni;
    }

    public double getInvoiceAmount() {
        return precoUni * qtd;
    }
}
