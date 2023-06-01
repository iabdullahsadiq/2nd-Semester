package lab09;

public class Lab09 {

    public static void main(String[] args) {
        
        Bank b1 = new Bank("Meezan Bank");
        Employee e1 = new Employee("Abdullah");
        
        System.out.println(e1.getEmployeeName() + " is an Employee of " + b1.getBankName());
    }
}