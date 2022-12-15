import java.util.Scanner;

public class PS2Q2 {
    
    public static void main(String[] args) {
        
        // Declaration and Initialization
        Scanner sc = new Scanner(System.in);
        int num = 0, factor = 0, score = 0, quesCount = 0;

        // Start Game
        while (true) {

            // Get Number
            System.out.print("Enter a number (-1 to quit) : ");
            num = sc.nextInt();

            if (num == -1) { break; }
            
            // Increment of Number of Question
            quesCount++;

            // Get Factor
            System.out.print("Enter a factor : ");
            factor = sc.nextInt();

            // Get User Answer
            System.out.printf("%d is a factor of %d? (true/false): ", factor, num);

            // Check Answer and Display
            if (sc.next().equalsIgnoreCase(num % factor == 0 ? "true" : "false")) {
                System.out.println("Your answer is correct.");
                score++;
            }
            else { System.out.println("Your answer is incorrect."); }
        }

        // Display Final Score
        System.out.printf("The final score is %d/%d\n", score, quesCount);

        sc.close();
    }
}