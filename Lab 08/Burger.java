public class Burger {

    // Variable Belong to Class
    private static int allSales = 0;

    // Variables Belong to Object
    private final String ID;
    private int totalSold;

    // Constructor
    public Burger(String ID) {
        this.ID = ID;
        this.totalSold = 0;
    }

    // Methods
    public void salesToday(int count) {
        if (count > 0) {
            this.totalSold += count;
            allSales += count;
        }
    }

    public String getID() {
        return this.ID;
    }

    public int getTotalSold() {
        return this.totalSold;
    }

    public static int getAllTotalSold() {
        return allSales;
    }
}