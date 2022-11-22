package L10Q3;

public class Tester {

    public static void main(String[] args) {

        ShuffleCipher normalInput = new ShuffleCipher("inputNormal.txt", "outputShuffled.txt", 5);
        ShuffleCipher shuffledInput = new ShuffleCipher("inputShuffled.txt", "outputNormal.txt", 5);

        normalInput.shuffleFrom("Normal");
        shuffledInput.shuffleFrom("Shuffled");
    }
}