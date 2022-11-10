public class L2Q5 {
    
    public static void main(String[] args) {
        
        int randNum = (int) Math.round(Math.random() * 10000), sum = 0;

        // Recursion
        int rec = randNum;

        while (rec > 0) {
            sum += rec % 10;
            rec = rec / 10;
        }

        System.out.printf("The sum of all digits in %d is %d.", randNum, sum);
    }
}
