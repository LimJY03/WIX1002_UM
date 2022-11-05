import java.util.Arrays;
import java.util.Scanner;

public class L5Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = 0;
        double sum = 0;

        System.out.print("Enter number of students: ");
        N = sc.nextInt();

        double[] scoreArr = new double[N];

        for (int i = 0; i < N; i++) {

            scoreArr[i] += Math.round(Math.random() * 10000) / 100.0;
            sum += scoreArr[i];

            System.out.printf("Score %d: %.2f\n", (i + 1), scoreArr[i]);
        }

        Arrays.sort(scoreArr);

        System.out.printf("Highest score is %.2f.\nLowest score is %.2f.\n", scoreArr[N - 1], scoreArr[0]);
        System.out.printf("Average score is %.2f.", sum / N);

        sc.close();
    }
}