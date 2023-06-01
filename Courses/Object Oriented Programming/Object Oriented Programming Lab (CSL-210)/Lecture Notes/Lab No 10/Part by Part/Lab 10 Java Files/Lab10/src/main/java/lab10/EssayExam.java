package lab10;

public class EssayExam extends ExamType {

    String topic;
    public EssayExam(String subject, int duration, int marks, String topic) {
        super(subject, duration, marks);
        this.topic = topic;
    }
    public void conductExam() {
        System.out.println("Conducting essay exam on the topic: " + topic);
    }
}