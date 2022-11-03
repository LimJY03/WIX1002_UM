import java.util.Scanner;

public class L4Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score1 = 0, score2 = 0, rollRes = 0;
        boolean isP1Turn = true;

        while (Math.max(score1, score2) <= 100) {

//            System.out.printf("Player %d, type anything to roll: ", isP1Turn ? 1 : 2);
//            sc.next();

            rollRes = (int) (Math.random() * (6 - 1) + 1);

            if (isP1Turn) { score1 += rollRes; } else { score2 += rollRes; }

            System.out.printf("Player 1 Score: %d, Player 2 Score: %d\n", score1, score2);

            isP1Turn = !isP1Turn;
        }

        System.out.printf("Player %d won!", score1 > score2 ? 1 : 2);

        sc.close();
    }
}
