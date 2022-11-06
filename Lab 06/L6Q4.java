public class L6Q4 {

    public static void main(String[] args) {

        L6Q4 question = new L6Q4();

        System.out.println(question.getGCD(24, 8));
        System.out.println(question.getGCD(200, 625));
    }

    int getGCD(int q, int d) {

        L6Q4 question = new L6Q4();
        int temp = 0;

        if (q < d) {
            temp = q;
            q = d;
            d = temp;
        }

        temp = q % d;
        q = d;
        d = temp;

        if (d == 0) { return q; }

        return question.getGCD(q, d);
    }
}