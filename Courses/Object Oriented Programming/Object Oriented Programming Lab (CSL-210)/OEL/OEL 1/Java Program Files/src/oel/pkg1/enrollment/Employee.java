package oel.pkg1.enrollment;

public class Employee {

    private String empName, empEmail, empDesignation, empId, empContact;
    private double empSalary;
    
    public String get_empName(){
        return empName;  
    }  
    public String set_empName(){
        this.empName = empName;
    } 
    public String get_empEmail(){
        return empEmail;  
    }  
    public String set_empEmail(){
        this.empEmail = empEmail;
    } 
    public String get_empDesignation(){
        return empDesignation;  
    }  
    public String set_empDesignation(){
        this.empDesignation = empDesignation;
    }   
    public String get_empId(){
        return empId;  
    }  
    public String set_empId(){
        this.empId = empId;
    }    
    public String get_empContact(){
        return empContact;  
    }  
    public String set_empContact(){
        this.empContact = empContact;
    }  
    public Double get_empSalary(){
        return empSalary; 
    }  
    public Double set_empSalary(){
        this.empSalary = empSalary;
    }  
   public void Displayinfo (){
        
        System.out.println("Name: "+ get_empName());
        System.out.println("Email: "+ get_empEmail());
        System.out.println("Designation: "+ get_empDesignation());   
        System.out.println("ID: "+ get_empId());   
        System.out.println("Contact: "+ get_empContact());   
        System.out.println("Salary: "+ get_empSalary());
    }   
}