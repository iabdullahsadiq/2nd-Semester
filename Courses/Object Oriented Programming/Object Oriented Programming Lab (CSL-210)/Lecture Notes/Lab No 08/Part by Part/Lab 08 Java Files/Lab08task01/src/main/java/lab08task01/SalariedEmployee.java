package lab08task01;

public class SalariedEmployee extends Employee {

    private double weeklysalary;

    public SalariedEmployee() {
        super();
        this.weeklysalary = 0;
    }
    public SalariedEmployee(String fName, String lName, String CNIC, double weeklysalary) {
        super(fName, lName, CNIC);
        this.weeklysalary = weeklysalary;
    }
    public double getWeeklysalary() {
        return weeklysalary;
    }
    public void setWeeklysalary(double weeklysalary) {
        if (weeklysalary < 0) {
            System.out.println("Weekly Salary cannot be negative");
        } else {
            this.weeklysalary = weeklysalary;
        }
    }
    @Override
    public String tostring() {
        return "Salaried Employee: " + super.tostring();
    }
    @Override
    public double earnings() {
        return weeklysalary;
    }
}