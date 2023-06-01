package lab10;

public class Lab10 {

    public static void main(String[] args) {

        MCQExam mcq = new MCQExam("Math", 60, 100, 20, 4);
        EssayExam essay = new EssayExam("English", 90, 100, "The impact of social media on youth");

        mcq.displayDetails();
        mcq.conductExam();

        System.out.println();

        essay.displayDetails();
        essay.conductExam();
    }
}