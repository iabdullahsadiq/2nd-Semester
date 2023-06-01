package lab05task05;

import java.util.Scanner;

public class Greeting {

    public static void greetMe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Nice to meet you.");
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");
    }
}
