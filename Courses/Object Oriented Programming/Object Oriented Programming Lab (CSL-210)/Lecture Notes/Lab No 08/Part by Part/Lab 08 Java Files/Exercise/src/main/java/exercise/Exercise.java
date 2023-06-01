package exercise;

public class Exercise {

    public static void main(String[] args) {
        Employee e1 = new Salary("Abdullah Sadiq", "xyz",000000,86000);
        Salary s1 = new Salary("Saad","bcbcbc",99373,110000);
        System.out.println("Involving MailCheck method by Employee Class Reference");
        e1.mailCheck();
        System.out.println("Involving MailCheck method by Salary Class Reference");
        s1.mailCheck();
        
        e1.toString();
        s1.toString();
        double pay = s1.computePay();
        System.out.println("The computed pay is " + pay);
    }
}