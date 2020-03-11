package pl.zzpj2020.solid.lsp.shape;

public class Rectangle extends Square {

    private double b;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double perimeter() {
        return super.getA() * 2 + b * 2;
    }

    @Override
    public double area() {
        return super.getA() * b;
    }
}
