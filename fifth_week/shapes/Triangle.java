package shapes;

public class Triangle extends Shape {
    private final String type = "Triangolo";

    private double side;
    private double basis;
    private double height;

    public Triangle(double side, double basis, double height) {
        this.side = side;
        this.basis = basis;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public double getPerimeter() {
        double perimeter = this.side * 3;
        return perimeter;
    }

    public double getArea() {
        double area = (this.basis * this.height) / 2;
        return area;
    }
}
