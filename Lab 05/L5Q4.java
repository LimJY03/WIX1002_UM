import java.util.Scanner;

public class L5Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] matrix = new String[3][3];

        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                matrix[j][i] = sc.next();
            }
        }

        String temp = String.join(
                "\n",
                String.join(" ", matrix[0]),
                String.join(" ", matrix[1]),
                String.join(" ", matrix[2])
        );

        System.out.println(temp);

        sc.close();
    }
}
