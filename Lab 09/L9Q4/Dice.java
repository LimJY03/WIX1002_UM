package L9Q4;

public class Dice {

    protected String playerName;

    // Constructor
    public Dice(String name) {
        this.playerName = name;
    }

    // Methods
    public int rollDice() {
        return (int) Math.round(Math.random() * 5) + 1;
    }
}