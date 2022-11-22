package L10Q1;

public abstract class EmployeeSalary {

    protected final String NAME;

    public EmployeeSalary(String name) {
        this.NAME = name;
    }
    public abstract void displayDetails();
}