package L10Q1;

public class TemporaryStaff extends EmployeeSalary {

    protected double salary;

    // Constructor
    public TemporaryStaff(String name, double workHours) {
        super(name);
        this.salary = 15 * workHours;
    }

    // Methods
    @Override
    public void displayDetails() {
        System.out.printf("\nTemporary Employee\n===\nName: %s\nSalary Per Month: %.2f\n", this.NAME, this.salary);
    }
}