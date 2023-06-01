package CourseApp;

public class Student {

    private String StudentName;
    private String CourseName;

    public String ToString() {
        return "Student Name = " + StudentName + ",   Course = " + CourseName + "";
    }
    public void setName(String Name) {
        StudentName = Name;
    }
    public String getName() {
        return StudentName;
    }
    public void setCourseName(String course) {
        CourseName = course;
    }
    public String GetCourseName() {
        return CourseName;
    }
}