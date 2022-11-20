package L9Q4;

public class Game1 extends Dice {

    protected final String NAME;
    protected final Dice d1, d2;
    protected int playerScore;

    // Constructor
    public Game1(String name) {
        super(name);
        this.NAME = name;
        this.d1 = new Dice(this.NAME);
        this.d2 = new Dice(this.NAME);
    }

    // Methods
    public void roll() {
        int d1Score = 0, d2Score = 0;
        do {
            d1Score = this.d1.rollDice();
            d2Score = this.d2.rollDice();
            System.out.printf("%s rolled %d and %d!\n", this.NAME, d1Score, d2Score);
            this.playerScore += d1Score + d2Score;
        }
        while (d1Score == d2Score);
    }

    public int getPlayerScore() {
        return this.playerScore;
    }

    public void showPlayerScore() {
        System.out.printf("Score for %s: %d\n", this.NAME, this.playerScore);
    }
}