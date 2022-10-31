public class L2Q3 {
    
    public static void main(String[] args) {
        
        double[] randomNum = new double[3];
        double sum = 0.0;

        for (int i = 0; i < 3; i++) {

            randomNum[i] = Math.round((Math.random() * 40 + 10) * 100) / 100.0;
            sum += randomNum[i];

            System.out.printf("Number %d: %.2f\n", i, randomNum[i]);
        }

        System.out.printf("Sum of numbers is %.2f\n", sum);
        System.out.printf("Average of numbers is %.2f\n", sum / 3);
    }
}
