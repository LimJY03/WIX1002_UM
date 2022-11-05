import java.util.Arrays;
import java.util.Scanner;

public class L5Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int search = 0;

        System.out.println("A list of 20 random integer within 0 to 100");

        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));

        reverse(arr);

        System.out.print("Enter a number to search: ");
        search = sc.nextInt();

        linearSearch(arr, search);
        binarySearch(arr, search);

        sc.close();
    }

    static void reverse(int[] array) {

        int n = array.length;

        System.out.println("Array in descending order");

        Arrays.sort(array);

        for (int j = 0; j < n / 2; j++) {
            int temp = array[j];
            array[j] = array[(n - 1) - j];
            array[(n - 1) - j] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    static void linearSearch(int[] array, int n) {

        int loopCount = 0;

        for (int i: array) {
            if (i == n) { break; }
            loopCount++;
        }

        if (loopCount < array.length) {
            System.out.printf("%d found\nLinear Search - %d loop(s)\n", n, loopCount);
        }
    }

    static void binarySearch(int[] array, int n) {

        int low = 0, high = array.length - 1, mid = 0, loopCount = 0;

        while (high >= low) {

            mid = low + (high - low) / 2;

            if (array[mid] == n) {
                System.out.printf("%d found\nBinary Search - %d loop(s)\n", n, loopCount);
                break;
            }
            else if (n < array[mid]) {
                low = mid + 1;
                loopCount++;
            }
            else {
                high = mid - 1;
                loopCount++;
            }
        }
    }
}