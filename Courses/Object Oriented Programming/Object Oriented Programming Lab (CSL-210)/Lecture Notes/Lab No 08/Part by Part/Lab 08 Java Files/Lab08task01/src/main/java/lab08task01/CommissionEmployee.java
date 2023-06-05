package lab08task01;

public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee() {
        super();
        this.commissionRate = 0;
        this.grossSales = 0;
    }
    public CommissionEmployee(String fName, String lName, String CNIC, double grossSales,
            double commissionRate) {
        super(fName, lName, CNIC);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public void setGrossSales(double grossSales) {
        if (grossSales < 0) {
            System.out.println("Gross Sales cannot be negative");
        } else {
            this.grossSales = grossSales;
        }
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0) {
            System.out.println("Commision Rate cannot be negative");
        } else {
            this.commissionRate = commissionRate;
        }
    }
    @Override
    public String tostring() {
        return "Commission Employee: " + super.tostring();
    }
    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }
}