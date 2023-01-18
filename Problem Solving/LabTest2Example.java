public class LabTest2Example {

    public static void main(String[] args) {
        double total = 0;

        // Create the object
        Delivery a = new Delivery("Ali", "Ahmad", 4.4);
        Delivery b = new Delivery("Ah Chong", "Fatimah", 63.1);
        SpecialDelivery c = new SpecialDelivery("FSKTM, UM", "FK, UM", 32.5, true, false);
        SpecialDelivery d = new SpecialDelivery("Ang", "Liew", 19.0, true, true);

        // Show the shipping for each delivery
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());

        // Calculate and show the grand total
        total += a.totalCost();
        total += b.totalCost();
        total += c.totalCost();
        total += d.totalCost();
        System.out.println("The total shipping cost is RM " + total);
    }
}

// Parent class
class Delivery {

    // Object variables
    private String sender, recipient;
    private double weight = 0.0;

    // Constructor
    public Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;

        // Check invalid value
        if (weight >= 0) { this.weight = weight; }
        else { System.out.println("Invalid Weight"); }
    }

    // Return formatted dp
    protected double to2dp(double val) { return ((int) (val * 100)) / 100.0; }

    // Return total shipping cost
    public double totalCost() {
        if (this.weight <= 5) { return this.to2dp(this.weight * 2.8); }
        else if (this.weight <= 20) { return this.to2dp(5 * 2.8 + (this.weight - 5) * 5.2); }
        else if (this.weight <= 50) { return this.to2dp(5 * 2.8 + 15 * 5.2 + (this.weight - 20) * 7); }
        else { return this.to2dp(5 * 2.8 + 15 * 5.2 + 30 * 7 + (this.weight - 50) * 8.6); }
    }

    // Return stringified output
    public String toString() {
        return String.format(
            "From : %s To: %s\nWeight of Package : %.1f kg\nShipping Cost : RM%.2f\n", 
            this.sender, this.recipient, this.weight, this.totalCost()
        );
    }
}

// Child class
class SpecialDelivery extends Delivery {

    // Object variables
    private boolean weekendDelivery, nighttimeDelivery;

    // Constructor
    public SpecialDelivery(String sender, String recipient, double weight, boolean weekendDelivery, boolean nighttimeDelivery) {
        super(sender, recipient, weight);
        this.weekendDelivery = weekendDelivery;
        this.nighttimeDelivery = nighttimeDelivery;
    }

    // Return total shipping cost
    @Override
    public double totalCost() {
        double price = super.totalCost() + (this.weekendDelivery ? 50 : 0);
        return this.nighttimeDelivery ? super.to2dp(price * 1.2) : price;
    }

    // Return stringified output
    @Override
    public String toString() {
        return super.toString() + (this.weekendDelivery ? "Weekend Delivery\n" : "") + (this.nighttimeDelivery ? "Night Time Delivery\n" : "");
    }
}