package N2.Ex02.Entidades;

import N2.Ex02.Interface.FiguraGeometrica;

public class Retangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base * altura);
    }

    @Override
    public double getPerimetro() {
        return 2 * base + 2 * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void exibirDados() {
        System.out.println("\n------ Retângulo ------\n"
                + "Base: " + base
                + "\nAltura: " + altura
                + "\nÁrea: " + getArea()
                + "\nPerímetro: " + getPerimetro());
    }
}
