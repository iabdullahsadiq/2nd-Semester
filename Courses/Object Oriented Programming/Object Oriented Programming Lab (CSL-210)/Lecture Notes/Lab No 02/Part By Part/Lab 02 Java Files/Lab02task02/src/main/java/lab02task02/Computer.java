package lab02task02;

import java.util.Scanner;

public class Computer {

    static Scanner in = new Scanner(System.in);

    String ram = "8 GB";
    String storage = "500 GB";
    String processor = "Core i5";
    String gen = "6th";
    String oS = "Wingows 10 Pro 64 bit";
    char rep;

    public void Display() {

        System.out.println("\n  -System Specifications-");
        System.out.println("Processor: " + processor);
        System.out.println("Generation: " + gen);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Operating System: " + oS);
    }

    public void Update() {

        System.out.println("\nDo you want to update any Feature?");
        System.out.println("Reply y for Yes, n for No.....");
        rep = in.next().charAt(0);

        if (rep == 'y' || rep == 'Y') {
            System.out.println("Which of the following do you want to update?");
            System.out.println("a) Processor\nb) Generation\nc) RAM\nd) Storage\ne) Operating System");
            System.out.println("Please reply from a to e.......");

            rep = in.next().charAt(0);

            switch (rep) {
                case 'a', 'A':
                    System.out.print("Enter the Processor: ");
                    processor = in.nextLine();
                    break;
                case 'b', 'B':
                    System.out.print("Enter the Generation: ");
                    gen = in.next();
                    break;
                case 'c', 'C':
                    System.out.print("Enter the RAM: ");
                    ram = in.nextLine();
                    break;
                case 'd', 'D':
                    System.out.print("Enter the Storage: ");
                    storage = in.nextLine();
                    break;
                case 'e', 'E':
                    System.out.print("Enter the Operating System: ");
                    oS = in.nextLine();
                    break;
                default:
                    System.out.println("Invalid Input! Please reply from a to e.......");
                    break;
            }
        } else if (rep == 'n' || rep == 'N') {
            System.out.println("Have a nice Day");
        } else {
            System.out.println("Invalid Input! Please reply from a to e.......");
        }
    }
}
