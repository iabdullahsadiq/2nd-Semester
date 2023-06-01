package lab05task02;

public class Student {

    String name;
    int Enrollement_no;
    static String university_name = "bahria university";
    static int semester = 2;
    static int roll_no = 1;
    static int counter = 0;

    static int setroll_no() {
        counter++;
        return counter;
    }
    Student(String n, int en) {
        name = n;
        Enrollement_no = en;
    }
    void display() {
        System.out.println("Name is: " + name + "\nRoll no is: " + roll_no + "\nEnrollement no: " + Enrollement_no + "\nSemester : " + semester + "\nUniversity Name: " + university_name);
    }
}
