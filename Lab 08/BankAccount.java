public class BankAccount {

    private final String NAME;
    private final String IC;
    private final String PASSPORT;
    private double balance;

    // Constructors
    public BankAccount(String name, String ic, String passportNum, double deposit) {
        this.NAME = name;
        this.IC = ic;
        this.PASSPORT = passportNum;
        this.balance = deposit;
        System.out.printf("Savings Account created for %s (IC Number [%s] and Passport Number [%s]).\n", this.NAME, this.IC, this.PASSPORT);
        System.out.printf("Currently, there are RM%.2f in your account.\n", this.balance);
    }

    // Methods
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < this.balance) { this.balance -= amount; }
        else { System.out.println("The amount exceeds your current savings!"); }
    }

    public void displayBalance() {
        System.out.printf("Amount in current savings: RM%.2f\n", this.balance);
    }
}