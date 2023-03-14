package shapes;

public class Circle extends Shape {
    private final String type = "Cerchio";
    private double radius;
    private final double pi = Math.PI;

    public String getType() {
        return type;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        double perimeter = (2 * this.radius) * pi;
        return perimeter;
    }

    public double getArea() {
        double area = Math.pow(2, this.radius) * pi;

        return area;

    }
}
