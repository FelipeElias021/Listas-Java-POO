package ListaPOO01.Ex007;

public class ElevadorTeste {
    public static void main(String[] args) {
        Elevador elev = new Elevador(8, 4);

        for (int i = 0; i < 3; i++) {
            elev.entra();
        }
        elev.desce();
        for (int i = 0; i < 5; i++) {
            elev.sobe();
        }
        for (int i = 0; i < 2; i++) {
            elev.sai();
        }
        for (int i = 0; i < 4; i++) {
            elev.desce();
        }

        System.out.println("Andar Atual: " + elev.andarAtual);
        System.out.println("Pessoas no Elevador: " + elev.pessoasElevador);
    }
}
