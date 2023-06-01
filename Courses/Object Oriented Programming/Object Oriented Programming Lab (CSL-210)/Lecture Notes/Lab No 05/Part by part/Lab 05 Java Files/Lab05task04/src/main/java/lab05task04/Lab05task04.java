package lab05task04;

import java.util.Scanner;

public class Lab05task04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        InsultGenerator i1 = new InsultGenerator(name, age);
        i1.insulted(name, age);
    }
}
