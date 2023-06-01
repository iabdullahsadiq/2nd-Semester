package aggregationexercise;

import java.util.*;

public class AggregationExercise {

    public static void main(String[] args) {
        
        Student s1 = new Student("Abdullah",01, "BSE");
        Student s2 = new Student("Hamza",02, "BEE");
        Student s3 = new Student("Anus",03, "BSE");
        Student s4 = new Student("Aashir",04, "BEE");  
        
        List <Student> bse_students = new ArrayList<Student>();
        bse_students.add(s1);
        bse_students.add(s3);
        
        List <Student> bee_students = new ArrayList<Student>();
        bee_students.add(s2);
        bee_students.add(s4);
        
        Department BSE = new Department("BSE", bse_students);
        Department BEE = new Department("BEE", bee_students);
        
        List <Department> departments = new ArrayList <Department>();
        departments.add(BSE);
        departments.add(BEE);
        
        Institute institute = new Institute("BITS", departments);
        
        System.out.println("Total Students in Institute: " + institute.getTotalStudentsInInstitute());
        System.out.println("Total Students in Department: " + institute.getTotalStudentsInDepartment());
    }
}