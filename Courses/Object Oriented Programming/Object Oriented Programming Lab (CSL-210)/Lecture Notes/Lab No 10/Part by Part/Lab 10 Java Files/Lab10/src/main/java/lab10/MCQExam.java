package lab10;

public class MCQExam extends ExamType {

    int questions;
    int options;

    public MCQExam(String subject, int duration, int marks, int questions, int options) {
        super(subject, duration, marks);
        this.questions = questions;
        this.options = options;
    }
    public void conductExam() {
        System.out.println("Conducting MCQ exam with " + questions + " questions and " + options + " options each.");
    }
}