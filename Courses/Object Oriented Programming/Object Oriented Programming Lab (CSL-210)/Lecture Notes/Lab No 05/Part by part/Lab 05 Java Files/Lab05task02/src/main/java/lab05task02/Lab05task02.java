package lab05task02;

public class Lab05task02 {

    public static void main(String[] args) {

        Student s1 = new Student("John Doe", 12345);
        s1.roll_no = Student.setroll_no();
        s1.display();

        Student s2 = new Student("Jane Smith", 67890);
        s2.roll_no = Student.setroll_no();
        s2.display();
    }
}
