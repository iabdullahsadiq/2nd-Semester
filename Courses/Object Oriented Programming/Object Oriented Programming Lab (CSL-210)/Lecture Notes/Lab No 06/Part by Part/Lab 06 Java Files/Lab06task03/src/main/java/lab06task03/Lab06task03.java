package lab06task03;

public class Lab06task03 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setInfo("Abdullah Sadiq", 19, "HBCHS");
        s1.printInfo();

        Student s2 = new Student();
        s2.setInfo("Kamran Iqbal", 18, "Gulshan");
        s2.printInfo();

        Student s3 = new Student();
        s3.setInfo("Ahad", 18, "XYZ");
        s3.printInfo();
    }
}
