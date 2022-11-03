import java.util.ArrayList;
import java.util.Scanner;

public class L4Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int input = 0, i = 1;

        System.out.print("Enter an Integer: ");
        input = sc.nextInt();

        while (!arr.contains(i)) {

            if (input % i == 0) {
                System.out.printf("%d, ", i);
                arr.add(input / i);
            }

            i++;
        }

        for (int j = arr.size() - 1; j > 0; j--) {
            System.out.printf("%d, ", arr.get(j));
        }

        System.out.print(arr.get(0));

        sc.close();
    }
}