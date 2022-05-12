package ListaPOO01.Ex008;

public class ControleRemoto {
    private int volume;
    private int canal;

    public ControleRemoto() {
        volume = 10;
        canal = 15;
    }

    public boolean aumentaVolume() {
        if (volume < 100) {
            volume++;
            return true;
        }
        return false;
    }

    public boolean diminuiVolume() {
        if (volume > 0) {
            volume--;
            return true;
        }
        return false;
    }

    public void aumentaCanal() {
        if (canal == 600) {
            canal = 0;
        } else {
            canal++;
        }
    }

    public void diminuiCanal() {
        if (canal == 0) {
            canal = 600;
        } else {
            canal--;
        }
    }

    public boolean trocarCanal(int num) {
        if (num >= 0 && num <= 600) {
            canal = num;
            return true;
        }
        return false;
    }

    public int getVolume(){
        return volume;
    }

    public int getCanal(){
        return canal;
    }

}
