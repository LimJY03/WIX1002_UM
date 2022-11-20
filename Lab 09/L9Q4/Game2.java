package L9Q4;

public class Game2 extends Dice {

    protected final String NAME;
    protected Dice dice;
    protected int playerScore;

    // Constructor
    public Game2(String name) {
        super(name);
        this.NAME = name;
        this.dice = new Dice(this.NAME);
    }

    // Methods
    public void roll() {
        int score = this.dice.rollDice();
        System.out.printf("%s rolled %d!\n", this.NAME, score);
        if (score == 6) {
            score = this.dice.rollDice();
            System.out.printf("%s rolled %d!\n", this.NAME, score);
            if (score == 6) { score = 0; }
        }
        if (this.playerScore + score <= 100) { this.playerScore += score; };
    }

    public int getPlayerScore() {
        return this.playerScore;
    }

    public void showPlayerScore() {
        System.out.printf("Score for %s: %d\n", this.NAME, this.playerScore);
    }
}