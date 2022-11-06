import java.util.Scanner;

public class L6Q5 {

    public static void main(String[] args) {

        L6Q5 game = new L6Q5();

        game.start();
    }

    void start() {

        Scanner sc = new Scanner(System.in);

        int n1 = 0, n2 = 0, score = 0, input = 0;

        do {
            System.out.println("Enter negative number to quit:");

            n1 = (int) (Math.random() * 12);
            n2 = (int) (Math.random() * 12);

            System.out.printf("%d × %d = ", n1, n2);

            input = sc.nextInt();

            if (n1 * n2 == input) {
                score++;
            }
        }
        while (input >= 0);

        System.out.printf("Your Score is %d", score);

        sc.close();
    }
}