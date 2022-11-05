import java.util.ArrayList;
import java.util.Scanner;

public class L5Q6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> temp = new ArrayList<>();
        int rows = 0;

        System.out.print("Enter the number of rows of Pascal Triangle to generate: ");
        rows = sc.nextInt();

        if (rows == 1) {
            System.out.println(1);
        }
        else if (rows == 2) {
            System.out.println("1 0\n1 1");
        }
        else {

            System.out.printf("1 %s\n", ("0 ").repeat(rows - 1));
            System.out.printf("1 1 %s\n", ("0 ").repeat(rows - 2));
            temp.add(0);
            temp.add(1);
            temp.add(1);
            temp.add(0);

            for (int i = 2; i < rows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.printf("%d ", temp.get(j) + temp.get(j + 1));
                    temp.add(temp.get(j) + temp.get(j + 1));
                }
                System.out.printf("%s\n", ("0 ").repeat(rows - i - 1));
                for (int k = 0; k <= i; k++) {
                    temp.remove(2);
                }
                temp.add(0);
            }
        }

        sc.close();
    }
}
