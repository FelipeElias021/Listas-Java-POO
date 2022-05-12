package ListaPOO01.Ex007;

public class Elevador {
    public int andarAtual;
    public int totalAndares;
    public int capacidadeElevador;
    public int pessoasElevador;

    public Elevador(int totalAndares, int capacidadeElevador) {
        andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.pessoasElevador = 0;
    }

    public boolean entra() {
        if (pessoasElevador < capacidadeElevador) {
            pessoasElevador++;
            return true;
        }
        return false;
    }

    public boolean sai() {
        if (pessoasElevador > 0) {
            pessoasElevador--;
            return true;
        }
        return false;
    }

    public boolean sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            return true;
        }
        return false;
    }

    public boolean desce() {
        if (andarAtual > 0) {
            andarAtual--;
            return true;
        }
        return false;
    }
}
