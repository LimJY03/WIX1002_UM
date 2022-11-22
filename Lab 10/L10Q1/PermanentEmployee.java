package L10Q1;

public class PermanentEmployee extends EmployeeSalary {

    protected final String CATEGORY;
    protected final double SALARY_MONTH;

    // Constructor
    public PermanentEmployee(String name, String category) {
        super(name);
        this.CATEGORY = category;
        this.SALARY_MONTH = (category.equalsIgnoreCase("A")) ? 4000 : (category.equalsIgnoreCase("B")) ? 3000 : (category.equalsIgnoreCase("C")) ? 2000 : 0;
    }

    // Methods
    @Override
    public void displayDetails() {
        System.out.printf("\nPermanent Employee\n===\nName: %s\nCategory: %s\nSalary Per Month: %.2f\n", this.NAME, this.CATEGORY, this.SALARY_MONTH);
    }
}