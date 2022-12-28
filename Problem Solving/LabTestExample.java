import java.util.Scanner;

public class LabTestExample {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[][] data = {
            {"s12345", "Ali", "77.9"},
            {"s24567", "Beng", "23.5"},
            {"s23789", "Carmen", "98.3"},
            {"s14569", "Dinesh", "68.0"},
            {"s18743", "Emilia", "75.2"}
        };

        System.out.print("Sort By Type (ID, Name, Marks): ");
        String input = sc.next();
        int type = input.equalsIgnoreCase("ID") ? 0 : input.equalsIgnoreCase("Name") ? 1 : 2;

        bubbleSortAsc(data, type);

        for (String[] row: data) {
            printRow(row);
        }

        sc.close();

    }

    static void bubbleSortAsc(String[][] arr, int elemIdx) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (compare(arr[j][elemIdx], arr[j + 1][elemIdx], elemIdx < 2)) {
                    String[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static boolean compare(String elem1, String elem2, boolean ascending) {
        return ascending ? elem1.compareTo(elem2) > 0 : elem1.compareTo(elem2) < 0;
    }

    static void printRow(String[] arr) {

        System.out.printf("%-10s%-10s%5s\n", arr[0], arr[1], arr[2]);
    }
}