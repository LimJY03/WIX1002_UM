package L10Q1;

public class Tester {

    public static void main(String[] args) {

        PermanentEmployee emp1 = new PermanentEmployee("Ahmad", "A");
        ContractStaff emp2 = new ContractStaff("Rahim", 250000);
        TemporaryStaff emp3 = new TemporaryStaff("Krishnan", 80);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}