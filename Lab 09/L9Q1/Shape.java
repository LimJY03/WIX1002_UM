package L9Q1;

public class Shape {

    protected final String NAME;
    protected double perimeter, area;

    // Constructor
    public Shape(String name) {
        this.NAME = name;
    }

    // Methods
    public void setPerimeter(double p) {
        this.perimeter = p;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    public void showDetails() {
        System.out.printf("%s: Perimeter = %.2f, Area = %2.f", this.NAME, this.perimeter, this.area);
    }
}