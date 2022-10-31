import java.util.Scanner;

public class L2Q4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int rawSec = 0, sec = 0, min = 0, hrs = 0;

        System.out.print("Enter the number of seconds: ");
        rawSec = sc.nextInt();

        hrs = rawSec / 3600;
        min = (rawSec % 3600) / 60;
        sec = rawSec % 60;

        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds", rawSec, hrs, min, sec);
    }
}
