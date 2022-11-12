public class L8Q {}

class TesterQ1 {

    public static void main(String[] args) {

        // Test Constructor
        Number arr = new Number(100, 10000);

        // Test Methods
        arr.displayAll();
        arr.displayEven();
        arr.displayPrime();
        arr.displayMax();
        arr.displayMin();
        arr.displayAvg();
        arr.displaySqNum();
    }
}

class TesterQ2 {

    public static void main(String[] args) {

        // Test Constructor
        BankAccount account = new BankAccount("FCSIT-UM", "012345-07-6789", "UMisOne", 100000);

        // Test Methods
        account.deposit(50000);
        account.displayBalance();
        account.withdraw(200000);
        account.withdraw(50000);
        account.displayBalance();
    }
}

class TesterQ3 {

    public static void main(String[] args) {

        // Test Constructor
        WeightCalculator calc = new WeightCalculator(19, 175);

        // Test Methods
        calc.displayAge();
        calc.displayHeight();
        calc.displayRecommendedWeight();
    }
}

class TesterQ4 {

    public static void main(String[] args) {

        // Test Constructor
        Fraction fraction = new Fraction();

        // Test Methods
        System.out.println(fraction.getNumerator());
        System.out.println(fraction.getDenominator());

        fraction.setNumerator(13452);
        fraction.setDenominator(56);
        fraction.displayReduced();
    }
}

class TesterQ5 {

    public static void main(String[] args) {

        boolean isPlayer1Turn = true;

        // Test Constructor
        Game player1 = new Game("John Doe");
        Game player2 = new Game("Hilary Ouse");

        // Test Game
        while (Math.max(player1.getScore(), player2.getScore()) < 100) {
            if (isPlayer1Turn) { player1.roll(); } else { player2.roll(); }
            isPlayer1Turn = !isPlayer1Turn;
        }

        System.out.printf("%s wins!\n", (player1.getScore() > player2.getScore()) ? player1.getName() : player2.getName());
    }
}

class TesterQ6 {

    public static void main(String[] args) {

        // Test Constructor
        Burger stallA = new Burger("Stall A");
        Burger stallB = new Burger("Stall B");
        Burger stallC = new Burger("Stall C");

        // Test Methods
        stallA.salesToday(12);
        stallB.salesToday(10);
        stallC.salesToday(23);

        System.out.printf("%s sold %d today.\n", stallA.getID(), stallA.getTotalSold());
        System.out.printf("%s sold %d today.\n", stallB.getID(), stallB.getTotalSold());
        System.out.printf("%s sold %d today.\n", stallC.getID(), stallC.getTotalSold());
        System.out.printf("Total of %d burgers are sold by all 3 stalls today.", Burger.getAllTotalSold());
    }
}

class TesterQ7 {

    public static void main(String[] args) {

        // Test Constructor
        Money m1 = new Money(2022.02);
        Money m2 = new Money(1988.91);

        // Test Methods
        m1.round();
        m2.round();

        m1.displayValue("m1");
        m2.displayValue("m2");

        m1.sub(m2); m1.displayValue("m1");
        m1.add(m2); m1.displayValue("m1");

        m1.displayNotes("m1");
        m2.displayNotes("m2");
    }
}