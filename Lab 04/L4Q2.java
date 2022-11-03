import java.util.Scanner;

public class L4Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println((int) (Math.pow(n, 3) + 3 * Math.pow(n, 2) + 2 * n) / 6);

        sc.close();
    }
}