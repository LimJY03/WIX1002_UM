public class Number {

    // Global Private Variable
    private final int[] ARR;

    // Constructors
    public Number() {
        ARR = new int[10];
        for (int i = 0; i < 10; i++) { this.ARR[i] = (int) (Math.random() * 100); }
    }

    public Number(int n) {
        ARR = new int[n];
        for (int i = 0; i < n; i++) { this.ARR[i] = (int) (Math.random() * 100); }
    }

    public Number(int n, int ub) {
        ARR = new int[n];
        for (int i = 0; i < n; i++) { this.ARR[i] = (int) (Math.random() * ub); }
    }

    // Methods
    public void displayAll() {
        System.out.println("All Elements in Array:");
        for (int elem: this.ARR) { System.out.printf("%d ", elem); }
        System.out.println();
    }

    public void displayEven() {
        System.out.println("All Even Elements in Array:");
        for (int elem: this.ARR) { if (elem % 2 == 0) { System.out.printf("%d ", elem); } }
        System.out.println();
    }

    public void displayPrime() {
        boolean isPrime = false;
        System.out.println("All Prime Elements in Array:");
        for (int elem: this.ARR) {
            if (elem == 1 || elem == 0) { continue; }
            for (int i = 2; i < Math.sqrt(elem); i++) {
                if (elem % i == 0) { isPrime = false; break; }
                isPrime = true;
            }
            if (isPrime) { System.out.printf("%d ", elem); }
        }
        System.out.println();
    }

    public void displayMax() {
        int max = Integer.MIN_VALUE;
        for (int elem: this.ARR) { max = Math.max(max, elem); }
        System.out.printf("Largest Element in Array: %d\n", max);
    }

    public void displayMin() {
        int min = Integer.MAX_VALUE;
        for (int elem: this.ARR) { min = Math.min(min, elem); }
        System.out.printf("Smallest Element in Array: %d\n", min);
    }

    public void displayAvg() {
        int sum = 0;
        for (int elem: this.ARR) { sum += elem; }
        System.out.printf("Average of Elements in Array: %.2f\n", (sum + 0.0) / this.ARR.length);
    }

    public void displaySqNum() {
        System.out.println("All Elements Squared in Array:");
        for (int elem: this.ARR) { System.out.printf("%d ", elem * elem); }
        System.out.println();
    }
}