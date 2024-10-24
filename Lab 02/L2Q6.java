import java.util.Scanner;

public class L2Q6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        L2Q1 converter = new L2Q1();
        
        double M = 0.0, Q = 0.0, Tf = 0.0, Ti = 0.0;

        System.out.print("Enter the amount of water in gram: ");
        M = sc.nextDouble() / 1000.0;

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        Ti = converter.fahrCels(sc.nextDouble());

        System.out.print("Enter the final temperature in Fahrenheit: ");
        Tf = converter.fahrCels(sc.nextDouble());

        Q = M * (Tf - Ti) * 4184;

        System.out.printf("The energy needed is %.2f joules.", Q);

        sc.close();
    }
}
