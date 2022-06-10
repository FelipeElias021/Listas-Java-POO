package N2.Ex02.Entidades;

import N2.Ex02.Interface.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void exibirDados() {
        System.out.println("\n------ Círculo ------\n"
                + "Raio: " + raio
                + "\nÁrea: " + getArea()
                + "\nPerímetro: " + getPerimetro());
    }
}
