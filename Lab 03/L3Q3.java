import java.util.Scanner;

public class L3Q3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double vol = 0.0;

        System.out.print("Enter the sales volume: ");
        vol = sc.nextDouble();
        
        System.out.printf("The commission is %.2f\n", vol * (vol > 1000 ? 0.125 : vol > 500 ? 0.1 : vol > 100 ? 0.075 : 0.05));

        sc.close();
    }
}
