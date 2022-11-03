public class L4Q6 {

    public static void main(String[] args) {

        int randNum = (int) (Math.random() * 100000);
        System.out.printf("Number of digits in %d is %d.", randNum, (int) Math.log10(randNum) + 1);
    }
}
