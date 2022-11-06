public class L6Q6 {

    public static void main(String[] args) {

        L6Q6 numbers = new L6Q6();

        numbers.displayPalindromePrime(20);
        numbers.displayEmirp(20);
    }

    void displayPalindromePrime(int n) {

        int i = 0, thisNumber = 2;

        System.out.println("First 20 Palindrome Primes:");

        while (i < n) {

            if ((((int) Math.log10(thisNumber) + 1) % 2 == 0) && !(((int) Math.log10(thisNumber) + 1) == 2)) {
                thisNumber = (int) Math.pow(10, (int) Math.log10(thisNumber) + 1);
            }

            if ((thisNumber == reverse(thisNumber)) && isPrime(thisNumber)) {
                System.out.printf("%d%s", thisNumber, (i < (n - 1)) ? ", " : "\n");
                i++;
            }

            thisNumber++;
        }
    }

    void displayEmirp(int n) {

        int i = 0, thisNumber = 13;

        System.out.println("First 20 Emirps:");

        while (i < n) {

            if (isPrime(thisNumber) && thisNumber != reverse(thisNumber) && isPrime(reverse(thisNumber))) {
                System.out.printf("%d%s", thisNumber, (i < (n - 1)) ? ", " : "\n");
                i++;
            }

            thisNumber++;
        }
    }

    static int reverse(int n) {

        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev;
    }

    static boolean isPrime(int n) {

        for (int i = 2; i < Math.sqrt(n); i++) {

            if (n % i == 0) { return false; }
        }

        return true;
    }
}