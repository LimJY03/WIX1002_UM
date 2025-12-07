public class L6Q4 {

    public static void main(String[] args) {

        L6Q4 question = new L6Q4();

        System.out.println(question.getGCD(24, 8));
        System.out.println(question.getGCD(200, 625));
    }

    int getGCD(int q, int d) {

        if (d == 0) { return q; }

        return question.getGCD(d, q % d);
    }
}
