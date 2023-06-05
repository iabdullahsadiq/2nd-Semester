package lab08task01;

public class Lab08task01 {

    public static void main(String[] args) {

        Employee e1 = new SalariedEmployee("Abdullah", "Sadiq", "42401-0000000-0", 20000);
        Employee e2 = new CommissionEmployee("Abdul", "Wahab", "4200-0000000-0", 20000, 2.58);
        Employee e3 = new BasePlusCommissionEmployee("Ali", "Nasir", "42030-0000000-0", 15000, 2.3, 80000);
        Employee e4 = new HourlyEmployee("Fahad", "Mustafa", "321-23-2985", 3000, 30);
        System.out.println("First Employee:");
        System.out.println(e1.tostring());
        System.out.println("Salary: " + e1.earnings());
        System.out.println("\nSecond Employee:");
        System.out.println(e2.tostring());
        System.out.println("Salary: " + e2.earnings());
        System.out.println("\nThird Employee:");
        System.out.println(e3.tostring());
        BasePlusCommissionEmployee currentEmployee = (BasePlusCommissionEmployee) e3;
        double oldbasesalary = currentEmployee.getBaseSalary();
        System.out.println("Old Base Salary: " + oldbasesalary);
        currentEmployee.setBaseSalary(1.10 * oldbasesalary);
        System.out.println("New salary with 10% increase is: " + currentEmployee.getBaseSalary());
        System.out.println("\nFourth Employee: ");
        System.out.println(e4.tostring());
        System.out.println("Salary: " + e4.earnings());
    }
}