import java.util.Scanner;

public class PS1Q1 {

    public static void main(String[] args) {
        
        // Declaration and Initialization
        Scanner sc = new Scanner(System.in);
        String move = "";
        int x = 0, y = 0;

        // Input Coordinates
        System.out.print("Enter the coordinate X and Y: ");
        x = sc.nextInt(); 
        y = sc.nextInt();

        // Input Move
        System.out.print("Enter the move: ");
        move = sc.next().toUpperCase();
        
        // Display Initial Coordinate
        System.out.printf("Initial Coordinate (%d,%d)\n", x, y);

        // Calculate Final Coordinate
        for (int i = 0; i < move.length(); i++) {

            switch (move.charAt(i)) {
                case 'L' -> x -= 1;
                case 'R' -> x += 1;
                case 'U' -> y += 1;
                case 'D' -> y -= 1;
                default -> {}
            }
        }

        // Display Final Coordinate
        System.out.printf("Final Coordinate (%d,%d)\n", x, y);

        sc.close();
    }
}