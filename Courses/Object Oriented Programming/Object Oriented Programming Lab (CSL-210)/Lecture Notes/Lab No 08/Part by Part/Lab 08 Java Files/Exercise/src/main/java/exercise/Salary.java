package exercise;

public class Salary extends Employee{
    private double salary;
    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary = salary;
    }
    public Salary(String name, String address, int number, double salary){
        super (name, address, number);
        this.salary = salary;
    }
    public void mailCheck(){
        System.out.println("MailCheck of Salary class");
        System.out.println("Mailing check to "+super.getName() + " with salary " + getSalary());
    }
    public double computePay(){
        System.out.println("Computing salary pay for "+ super.getName());
        return salary / 52;
    }
}