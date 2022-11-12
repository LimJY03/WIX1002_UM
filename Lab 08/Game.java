public class Game {

    private final String NAME;
    private int score = 0;

    // Constructor
    public Game(String name) {
        this.NAME = name;
    }

    // Methods
    public void roll() {
        this.score += 1 + (int) (Math.random() * 5);
    }

    public String getName() {
        return this.NAME;
    }

    public int getScore() {
        return this.score;
    }
}