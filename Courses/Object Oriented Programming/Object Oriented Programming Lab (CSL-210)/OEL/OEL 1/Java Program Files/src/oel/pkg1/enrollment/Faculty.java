package oel.pkg1.enrollment;

public class Faculty extends Employee {
    
    private double facultyfWorkingHours, facultyYearlyBomus;
    
    public void Displayinfo (){
        
        System.out.println("Name: "+ get_empName());
        System.out.println("Email: "+ get_empEmail());
        System.out.println("Designation: "+ get_empDesignation());   
        System.out.println("ID: "+ get_empId());   
        System.out.println("Contact: "+ get_empContact());   
        System.out.println("Salary: "+ get_empSalary());
    }   
}
