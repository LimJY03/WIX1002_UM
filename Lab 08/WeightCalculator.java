public class WeightCalculator {

    private final int AGE;
    private final double HEIGHT;

    // Constructor
    public WeightCalculator(int age, double height) {
        this.AGE = age;
        this.HEIGHT = height;
    }

    // Methods
    public double getRecommendedWeight() {
        return ((this.HEIGHT - 100) + ((double) this.AGE / 10)) * 0.9;
    }

    public void displayAge() {
        System.out.printf("Your age is %d.\n", this.AGE);
    }

    public void displayHeight() {
        System.out.printf("Your height is %.2fcm.\n", this.HEIGHT);
    }

    public void displayRecommendedWeight() {
        System.out.printf("Your recommended weight is %.2fkg.\n", getRecommendedWeight());
    }
}