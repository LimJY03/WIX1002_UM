public class L6Q2 {

    public static void main(String[] args) {

        L6Q2 shape = new L6Q2();

        for (int i = 0; i < 5; i++) {
            shape.multiPrint((i + 1), '*');
        }

        System.out.println("  *  ");
        System.out.println(" *** ");
        shape.multiPrint(5, '*');
        System.out.println(" *** ");
        System.out.println("  *  ");
    }

    void multiPrint(int n, char c) {

        System.out.println(String.valueOf(c).repeat(n));
    }
}