import java.util.Scanner;

public class L4Q2_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }

        System.out.printf("The sum is: %d\n", sum);
    }
}
