package N2.Ex02.Entidades;
import N2.Ex02.Interface.FiguraGeometrica;

public class Quadrado implements FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

    

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void exibirDados() {
        System.out.println("\n------ Quadrado ------\n"
                + "Lado: " + lado
                + "\nÁrea: " + getArea()
                + "\nPerímetro: " + getPerimetro());
    }
}
