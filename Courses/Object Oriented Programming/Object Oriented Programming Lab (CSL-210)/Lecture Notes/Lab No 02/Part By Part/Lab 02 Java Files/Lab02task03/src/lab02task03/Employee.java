package lab02task03;

import java.util.Scanner;

public class Employee {

    static Scanner in = new Scanner(System.in);

    String name, fName, designation;
    int age, salary;
    char rep;

    public void input() {

        System.out.println("Enter your Name:");
        name = in.nextLine();
        System.out.println("Enter your Father Name:");
        fName = in.nextLine();
        System.out.println("Enter your Designation:");
        designation = in.nextLine();
        System.out.println("Enter your Age");
        age = in.nextInt();
        System.out.println("Enter your Salary");
        salary = in.nextInt();

    }

    public void Display() {
        
        System.out.println("\n  -Your Profile-");
        System.out.println("Name: " + name);
        System.out.println("Father name: " + fName);
        System.out.println("Designation: " + designation);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }

    public void Update() {

        System.out.println("\nDo you want to update any Data?");
        System.out.println("Reply y for Yes, n for No.....");

        rep = in.next().charAt(0);
        if (rep == 'y' || rep == 'Y') {
            System.out.println("Which of the following do you want to update?");
            System.out.println("1) Designation\n2) Salary");
            System.out.println("Reply with 1 or 2........");
            int resp = in.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Enter your Designation:");
                    designation = in.nextLine();
                    break;
                case 2:
                    System.out.println("Enter your Salary");
                    salary = in.nextInt();
                    break;
                default:
                    System.out.println("\nInvalid Input! Please reply with 1 or 2........");
                    break;
            }
        } else if (rep == 'n' || rep == 'N') {
            System.out.println("\nHave a nice day....");      
        } else {
            System.out.println("\nInvalid Input! Please reply with y or n........");
        }
    }
}
