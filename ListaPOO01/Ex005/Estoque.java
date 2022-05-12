package ListaPOO01.Ex005;

public class Estoque {
    public String nome;
    public int qtdAtual;
    public int qtdMinima;

    public Estoque() {}

    public Estoque (String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        if (isPositivo(qtdAtual) && isPositivo(qtdAtual)) {
            this.qtdAtual = qtdAtual;
            this.qtdMinima = qtdMinima;
        } else {
            this.qtdAtual = 0;
            this.qtdMinima = 0;
        }
    }

    boolean isPositivo(int n) {
        if (n < 0) {
            return false;
        }
        return true;
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }

    public void mudarQtdMinima(int qtdMinima) {
        if (isPositivo(qtdAtual)) {
            this.qtdMinima = qtdMinima;
        }
    }

    public void repor(int qtd) {
        qtdAtual += qtd;
    }

    public void darBaixa(int qtd) {
        if (qtdAtual >= qtd) {
            qtdAtual -= qtd;
        }
    }

    public String mostra() {
        return "Produto: " + nome + "\nQuantidade mínima: " + qtdMinima + "\nQuantidade atual: " + qtdAtual;
    }

    public boolean precisaRepor() {
        if (qtdAtual < qtdMinima) {
            return true;
        } else {
            return false;
        }
    }
}
