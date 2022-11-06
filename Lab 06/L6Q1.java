public class L6Q1 {

    public static void main(String[] args) {

        L6Q1 calc = new L6Q1();

        for (int i = 1; i <= 20; i++) {
            System.out.println(calc.triangularNumber(i));
        }
    }

    int triangularNumber(int n) {
        return (n * (n + 1)) / 2;
    }
}
