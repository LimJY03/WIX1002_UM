import java.util.Scanner;

public class PS2Q1 {
    
    public static void main(String[] args) {
        
        // Declaration and Initialization
        Scanner sc = new Scanner(System.in);
        int numStaff = 0, workStaff = 0, id[];

        // Get Number of Staffs
        while (true) {

            System.out.print("Enter the number of staff [N] : ");
            numStaff = sc.nextInt();

            // Continue If Input Is Valid
            if ((numStaff >= 0) && (numStaff <= 90000)) { break; }

            System.out.println("INVALID NUMBER OF STAFF!!");
        }

        id = new int[numStaff];
        
        for (int i = 0; i < id.length; i++) {            

            int tempID = 0;
                        
            do { tempID = (int) Math.round(Math.random() * 89999) + 10000; }    // Generate Temporary ID
            while (hasFound(tempID, id));                                       // Check if ID is already generated before

            // Add The ID into ID Array
            id[i] = tempID;

            // Display Staff ID
            System.out.printf("Staff ID : %d\n", id[i]);

            // Display Working Status
            System.out.print("Weekend ");

            if (((id[i] / 1000) % 2 == 1) && ((id[i] / 10) % 2 == 0)) {
                System.out.println("Duty");
                workStaff++;
            }
            else { System.out.println("Off"); }
        }

        // Display Number of Staffs Work Weekend
        System.out.printf("The number of staffs work during weekend is %d\n", workStaff);

        sc.close();
    }

    public static boolean hasFound(int thisID, int[] arr) {
        
        for (int id: arr) {
            if (id < 10000) { return false; }
            if (thisID == id) { return true; }
        }
        
        return false;
    }
}