package ListaPOO01.Ex008;


public class Televisao {

    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        System.out.println("\nVolume: " + controle.getVolume());
        System.out.println("Canal: " + controle.getCanal());

        for (int i = 0; i < 43; i++) {
            controle.aumentaVolume();
        }
        for (int i = 0; i < 5436; i++) {
            controle.diminuiCanal();
        }

        System.out.println("\n\nVolume: " + controle.getVolume());
        System.out.println("Canal: " + controle.getCanal());

        for (int i = 0; i < 70; i++) {
            controle.diminuiVolume();
        }
        for (int i = 0; i < 43; i++) {
            controle.aumentaCanal();
        }

        System.out.println("\n\nVolume: " + controle.getVolume());
        System.out.println("Canal: " + controle.getCanal());
    }
}
