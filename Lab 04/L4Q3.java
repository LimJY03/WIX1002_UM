import java.util.Scanner;

public class L4Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = 0, min = 999, max = 0, N = 0, Xsqrd = 0, X = 0;

        System.out.print("Enter a score (negative score to quit): ");
        input = sc.nextInt();

        while (input >= 0) {

            min = Math.min(input, min);
            max = Math.max(input, max);
            X += input;
            Xsqrd += input * input;
            N++;

            System.out.print("Enter a score (negative score to quit): ");
            input = sc.nextInt();
        }

        System.out.printf("Minimum Score: %d\n", min);
        System.out.printf("Maximum Score: %d\n", max);
        System.out.printf("Average Score: %.2f\n", (double) X / N);
        System.out.printf("Standard Deviation: %.2f\n", Math.sqrt((double) (Xsqrd - Math.pow(X, 2) / N) / (N - 1)));

        sc.close();
    }
}