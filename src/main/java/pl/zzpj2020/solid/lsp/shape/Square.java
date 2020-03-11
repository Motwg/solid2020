package pl.zzpj2020.solid.lsp.shape;

public class Square extends Shape {

    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }

    @Override
    public double area() {
        return a * a;
    }
}
