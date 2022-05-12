package ListaPOO01.Ex002;

public class Quadrado {
    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return 4 * lado;
    }
}
