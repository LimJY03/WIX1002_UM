package L9Q1;

import java.util.Scanner;

public class Circle extends Shape {

    protected final double DIAMETER;

    // Constructor
    public Circle() {
        super("Circle");
        this.inputDiameter();
        this.compute();
    }

    // Methods
    private void inputDiameter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter of circle: ");
        this.DIAMETER = sc.nextDouble();    
        sc.close();
    }

    private void compute() {
        this.perimeter = Math.PI * this.DIAMETER;
        this.area = Math.PI * this.DIAMETER * this.DIAMETER / 4.0;
    }
}