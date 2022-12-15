import java.util.Scanner;

public class PS1Q2 {

    public static void main(String[] args) {

        // Declaration and Initialization
        Scanner sc = new Scanner(System.in);
        String type = "";
        double total = 0.0, kg = 0.0;
        
        while (true) {
            
            // Get Durian Type
            System.out.print("Enter the type of durian [Quit] to terminate: ");
            type = sc.next().toUpperCase();
            
            // Break When User Inputs "Quit"
            if (type.equalsIgnoreCase("Quit")) { break; }

            // Get Sales
            System.out.print("Enter the sales in kg: ");
            kg = sc.nextDouble();

            // Add Sales Based On Durian Type
            switch (type) {
                case "MK" -> total += 25 * kg;
                case "HL" -> total += 22 * kg;
                case "D24" -> total += 20 * kg;
                case "UM" -> total += 18 * kg;
                default -> {}
            }
        }

        // Display Total Sales
        System.out.printf("Total Sales: %.2f\n", total);

        sc.close();
    }
}