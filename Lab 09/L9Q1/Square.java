package L9Q1;

import java.util.Scanner;

public class Square extends Shape {

    protected final double SIDE;

    // Constructor
    public Square() {
        super("Square");
        this.inputSide();
        this.compute();
    }

    // Methods
    private void inputSide() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SIDE length of square: ");
        this.SIDE = sc.nextDouble();
        sc.close();
    }

    private void compute() {
        this.perimeter = this.SIDE * 4;
        this.area = this.SIDE * this.SIDE;
    }
}