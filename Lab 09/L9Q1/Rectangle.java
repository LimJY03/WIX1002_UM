package L9Q1;

import java.util.Scanner;

public class Rectangle extends Shape {

    protected final double SIDE_1, SIDE_2;

    // Constructor
    public Rectangle() {
        super("Rectangle");
        this.inputSide();
        this.compute();
    }

    // Methods
    private void inputSide() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: "); this.SIDE_1 = sc.nextDouble();
        System.out.print("Enter the width of rectangle:"); this.SIDE_2 = sc.nextDouble();
        sc.close();
    }

    private void compute() {
        this.area = this.SIDE_1 * this.SIDE_2;
        this.perimeter = 2 * (this.SIDE_1 + this.SIDE_2);
    }
}