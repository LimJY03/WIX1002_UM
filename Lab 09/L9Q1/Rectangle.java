package L9Q1;

import java.util.Scanner;

public class Rectangle extends Shape {

    protected double side1, side2;

    // Constructor
    public Rectangle() {
        super("Rectangle");
        this.inputSide();
        this.compute();
    }

    // Methods
    private void inputSide() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: "); this.side1 = sc.nextDouble();
        System.out.print("Enter the width of rectangle:"); this.side2 = sc.nextDouble();
        sc.close();
    }

    private void compute() {
        this.area = this.side1 * this.side2;
        this.perimeter = 2 * (this.side1 + this.side2);
    }
}