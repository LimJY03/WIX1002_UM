import java.util.Scanner;

public class L6Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        L6Q3 num = new L6Q3();

        int[] reversed = new int[10];

        System.out.println("Enter 10 integers separated by 1 whitespace:");

        for (int i = 0; i < 10; i++) {
            reversed[i] = num.reverse(sc.nextInt());
        }

        sc.close();
    }

    int reverse(int n) {

        int temp = 0;

        while (n > 0) {
            temp = temp * 10 + n % 10;
            n = n / 10;
        }

        return temp;
    }
}