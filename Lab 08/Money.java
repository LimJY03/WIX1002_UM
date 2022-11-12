import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

public class Money {

    LinkedHashMap<Integer, Integer> noteSet = new LinkedHashMap<>();
    private int valueCent;

    // Constructor
    public Money(double amount) {
        this.valueCent = (int) (amount * 100);
    }

    // Methods
    public void add(@NotNull Money m) {
        this.valueCent += m.valueCent;
    }

    public void sub(@NotNull Money m) {
        if (this.valueCent > m.valueCent) { this.valueCent -= m.valueCent; }
    }

    public void round() {
        switch (this.valueCent % 10) {
            case 1, 6 -> this.valueCent -= 1;
            case 2, 7 -> this.valueCent -= 2;
            case 3, 8 -> this.valueCent += 2;
            case 4, 9 -> this.valueCent += 1;
            default -> {}
        }
    }

    public void displayValue(String moneyName) {
        System.out.printf("The amount of money for %s is RM%.2f\n", moneyName, this.valueCent / 100.0);
    }

    public void displayNotes(String moneyName) {
        this.calcNotes();
        System.out.printf("For %s:\n", moneyName);
        for (int value: this.noteSet.keySet()) {
            System.out.printf("Number of %s needed: %d\n", (value / 100 > 0) ? "RM" + value / 100 : value + "cents", this.noteSet.get(value));
        }
    }

    private void calcNotes() {
        int note_100 = this.valueCent / 10000;   this.valueCent %= 10000;    this.noteSet.put(10000, note_100);
        int note_50 = this.valueCent / 5000;     this.valueCent %= 5000;     this.noteSet.put(5000, note_50);
        int note_10 = this.valueCent / 1000;     this.valueCent %= 1000;     this.noteSet.put(1000, note_10);
        int note_5 = this.valueCent / 500;       this.valueCent %= 500;      this.noteSet.put(500, note_5);
        int note_1 = this.valueCent / 100;       this.valueCent %= 100;      this.noteSet.put(100, note_1);
        int coin_50 = this.valueCent / 50;       this.valueCent %= 50;       this.noteSet.put(50, coin_50);
        int coin_20 = this.valueCent / 20;       this.valueCent %= 20;       this.noteSet.put(20, coin_20);
        int coin_10 = this.valueCent / 10;                                   this.noteSet.put(10, coin_10);
        int coin_5 = this.valueCent % 10;                                    this.noteSet.put(5, coin_5);
    }
}