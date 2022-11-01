public class L3Q2 {
    
    public static void main(String[] args) {
        
        String[] num = {"zero", "one", "two", "three", "four", "five"};
        int rand = (int) (Math.random() * 5);

        System.out.printf("%d is %s.\n", rand, num[rand]);
    }
}
