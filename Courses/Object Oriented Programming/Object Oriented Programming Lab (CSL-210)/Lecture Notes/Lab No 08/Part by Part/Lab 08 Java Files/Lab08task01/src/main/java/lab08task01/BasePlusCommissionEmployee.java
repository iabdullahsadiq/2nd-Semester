package lab08task01;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }
    public BasePlusCommissionEmployee(String fName, String lName, String CNIC, double grossSales, double commissionRate, double baseSalary) {
        super(fName, lName, CNIC, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            System.out.println("Base Salary cannot be negative");
        } else {
            this.baseSalary = baseSalary;
        }
    }
    @Override
    public String tostring() {
        return "Base plus " + super.tostring();
    }
    @Override
    public double earnings() {
        return baseSalary * super.earnings();
    }
}