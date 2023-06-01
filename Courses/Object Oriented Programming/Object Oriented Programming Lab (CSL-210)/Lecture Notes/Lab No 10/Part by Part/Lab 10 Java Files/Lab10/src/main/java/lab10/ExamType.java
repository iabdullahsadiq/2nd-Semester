package lab10;

public abstract class ExamType {

    String subject;
    int duration;
    int marks;

    public ExamType(String subject, int duration, int marks) {
        this.subject = subject;
        this.duration = duration;
        this.marks = marks;
    }
    abstract void conductExam();
    public void displayDetails() {
        System.out.println("Subject: " + subject);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Marks: " + marks);
    }
}