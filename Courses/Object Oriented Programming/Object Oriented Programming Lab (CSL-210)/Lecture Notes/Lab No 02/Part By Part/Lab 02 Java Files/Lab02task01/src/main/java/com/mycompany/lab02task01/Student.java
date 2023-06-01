package com.mycompany.lab02task01;

import java.util.Scanner;

public class Student {

    static Scanner in = new Scanner(System.in);

    String name, fName, department, email;
    Double gpa;
    char rep;

    public void Input() {

        System.out.println("Enter your Name:");
        name = in.nextLine();
        System.out.println("Enter your Father Name:");
        fName = in.nextLine();
        System.out.println("Enter your Department:");
        department = in.nextLine();
        System.out.println("Enter your Email");
        email = in.nextLine();
        System.out.println("Enter your GPA");
        gpa = in.nextDouble();
    }

    public void Display() {

        System.out.println("  -Your Profile-");
        System.out.println("Name: " + name);
        System.out.println("Father name: " + fName);
        System.out.println("Designation: " + department);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + gpa);
    }

    public void Update() {

        System.out.println("\nDo you want to update your Data?");
        System.out.println("Reply y for Yes, n for No.....");

        rep = in.next().charAt(0);

        if (rep == 'y' || rep == 'Y') {

            Input();
            
        } else if (rep == 'n' || rep == 'N') {

            System.out.println("Have a nice day");
        } else {
            System.out.println("Invalid Input! Please reply with y or n.....");
        }
    }
}
