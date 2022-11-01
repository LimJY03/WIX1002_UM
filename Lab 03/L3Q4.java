public class L3Q4 {
    
    public static void main(String[] args) {

        int sum1 = 0, sum2 = 0, roll = 0;
        
        System.out.println("Two Player Dice Game\n===");
        
        for (int i = 1; i < 3; i++) {

            roll = (int) (Math.random() * 5 + 1);
            sum1 += roll;
            
            System.out.printf("Player 1 gets %d in roll %d!\n", roll, i);
        }
        
        for (int j = 1; j < 3; j++) {

            roll = (int) (Math.random() * 5 + 1);
            sum2 += roll;
            
            System.out.printf("Player 1 gets %d in roll %d!\n", roll, j);
        }

        System.out.printf("Player %d wins the game with highest score of %d!\n", (sum1 > sum2 ? 1 : 2), Math.max(sum1, sum2));
    }
}
