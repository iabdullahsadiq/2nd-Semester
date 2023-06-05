package lab08task01;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee() {
        super();
        this.hours = 0;
        this.wage = 0;
    }
    public HourlyEmployee(String fName, String lName, String CNIC, double wage, double hours) {
        super(fName, lName, CNIC);
        this.hours = hours;
        this.wage = wage;
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        if (wage < 0) {
            System.out.println("Wage cannot be below 0");
        } else {
            this.wage = wage;
        }
    }
    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        if (hours < 0) {
            System.out.println("Hours cannot be negative");
        } else {
            this.hours = hours;
        }
    }
    public String tostring() {
        return "Hourly Employee: " + super.tostring();
    }
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }
}