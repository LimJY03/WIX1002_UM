import java.util.Scanner;

public class L3Q6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double r = 0.0, x = 0.0, y = 0.0;

        System.out.print("Enter the radius: ");
        r = sc.nextDouble();
        
        System.out.print("Enter the x and y coordinate separated by 1 whitespace: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        
        System.out.printf("The point is %s the circle.\n", Math.sqrt((x * x) + (y * y)) <= r ? "inside" : "outside");

        sc.close();
    }
}
