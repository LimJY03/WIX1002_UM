import java.util.Scanner;

public class L3Q5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double a = 0.0, b = 0.0, c = 0.0, d = 0.0, e = 0.0, f = 0.0;
        
        System.out.println("Simultaneous linear equations consists of 2 equations, ax + by = e and cx + dy = f");
        
        System.out.print("For equation ax + by = e, enter the values for a, b, e separated by one whitespace: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        e = sc.nextDouble();

        System.out.print("For equation cx + dy = f, enter the values for c, d, f separated by one whitespace: ");
        c = sc.nextDouble();
        d = sc.nextDouble();
        f = sc.nextDouble();

        if (((a * d) - (b * c)) == 0) { 

            System.out.println("The equation has no solution."); 
        }
        else {

            System.out.printf("x is %f.\n", ((e * d) - (b * f)) / ((a * d) - (b * c)));
            System.out.printf("y is %f.\n", ((a * f) - (e * c)) / ((a * d) - (b * c)));
        }

        sc.close();
    }
}