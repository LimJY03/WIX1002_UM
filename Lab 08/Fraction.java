import java.util.Scanner;

public class Fraction {

    private int numerator;
    private int denominator;

    // Constructor
    public Fraction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator (integer): "); this.numerator = sc.nextInt();
        System.out.print("Enter the denominator (integer): "); this.denominator = sc.nextInt();
    }

    // Methods
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void displayReduced() {
        System.out.printf("The reduced fraction is %d/%d.", (this.numerator / getGCD(this.numerator, this.denominator)), (this.denominator / getGCD(this.numerator, this.denominator)));
    }

    // Class-Specific Method
    private int getGCD(int A, int B) {
        int temp = Math.max(A, B) % Math.min(A, B); A = Math.min(A, B); B = temp;
        if (B == 0) { return A; }
        return getGCD(A, B);
    }
}