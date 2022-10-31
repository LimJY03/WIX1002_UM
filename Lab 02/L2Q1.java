import java.util.Scanner;

public class L2Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double cels = 0.0, fahr = 0.0;

        fahr = sc.nextDouble();
        cels = (fahr - 32) / 1.8;

        System.out.printf("%f Fahrenheit is %.2f Celsius.\n", fahr, cels);

        sc.close();
    }
}