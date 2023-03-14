package shapes;

import java.util.ArrayList;

public class ShapeManager {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    ShapeManager() {
        this.shapes = new ArrayList<Shape>();
    }

    // * aggiungi forma
    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    // * lista delle forme
    public void getShapes() {
        for (int i = 0; i < this.shapes.size(); i++) {
            System.out.println("----------------");
            System.out.println("Tipo: " + this.shapes.get(i).getType());
            System.out.println("Area: " + this.shapes.get(i).getArea());
            System.out.println("Perimetro: " + this.shapes.get(i).getPerimeter());
            System.out.println("----------------");
        }
    }

    // * somma area di tutte le forme
    public void getTotalArea() {
        double totalArea = 0;

        for (int i = 0; i < this.shapes.size(); i++) {
            totalArea += this.shapes.get(i).getArea();
        }
        System.out.println("L'area totale é: " + totalArea);
    }

    // * somma di tutti i perimetri
    public void getTotalPerimeter() {
        double totalPerimeter = 0;
        for (int i = 0; i < this.shapes.size(); i++) {
            totalPerimeter += this.shapes.get(i).getPerimeter();
        }
        System.out.println("Il perimetro totale é: " + totalPerimeter);
    }
}
