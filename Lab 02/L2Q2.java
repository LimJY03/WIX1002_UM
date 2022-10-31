import java.util.Scanner;

public class L2Q2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double P = sc.nextDouble(), 
               D = sc.nextDouble(), 
               R = sc.nextDouble(), 
               Y = sc.nextDouble();

        double M = (P - D) * (1 + R * Y / 100) / (Y * 12);

        System.out.printf("The monthly payment is %.2f\n", M);

        sc.close();
    }
}
