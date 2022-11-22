package L10Q1;

public class ContractStaff extends EmployeeSalary {

    protected final double SALARY = 500;
    protected double sales, commission;

    // Constructor
    public ContractStaff(String name, double sales) {
        super(name);
        this.sales = sales;
        this.commission = this.sales * 0.5;
    }

    // Methods
    @Override
    public void displayDetails() {
        System.out.printf("\nContract Staff\n===\nName: %s\nSalary Per Month: %.2f\nSales: %.2f\nCommission: %.2f\n", this.NAME, this.SALARY, this.sales, this.commission);
    }
}