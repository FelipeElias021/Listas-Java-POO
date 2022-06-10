package N2.Ex01.Entidades;

public class Notas {
    private double n1;
    private double n2;
    private double n3;

    public Notas() {
    }

    public Notas(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double getMedia() {
        return (n1 + n2 + n3) / 3;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public String toString() {
        return "\nN1 " + n1
                + "\nN2 " + n2
                + "\nN3 " + n3
                + "\nMédia " + getMedia();
    }

}
