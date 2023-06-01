package lab02task04;

import java.util.Scanner;

public class AutoMobile {

    static Scanner in = new Scanner(System.in);

    int horsePower = 1400;
    String color = "Red";
    String engineType = "Electrical";
    String transmission = "Mannual";
    char rep;

    public void Input() {

        System.out.println("Car is ON or OFF?");
        System.out.println("Reply 1 for ON and 2 for OFF......");
        rep = in.next().charAt(0);
        if (rep == '1') {

            Display();
            Update();
            
        } else if (rep == '2') {
            System.out.println("Do you want to start the car?");
            System.out.println("Reply y for yes n for no......?");
            rep = in.next().charAt(0);
            if (rep == 'y' || rep == 'Y') {

                Display();
                Update();

            } else if (rep == 'n' || rep == 'N') {
                System.out.println("Have a nice day");
            } else {
                System.out.println("Invalid Input! Please reply with y or n......");
            }
        } else {
            System.out.println("Invalid Input! Please reply with 1 0r 2......");
        }
    }
    public void Display() {

        System.out.println("  -Current Status-");
        System.out.println("Engine Type: " + engineType);
        System.out.println("Horse Power: " + horsePower);
        System.out.println("Transmission: " + transmission);
        System.out.println("Color: " + color);
    }
    public void Update() {
        System.out.println("\nDo you want to update any feature?");
        System.out.println("Reply y for yes n for no......?");
        rep = in.next().charAt(0);
        if (rep == 'y' || rep == 'Y') {
            System.out.println("Which part do you want to update?");
            System.out.println("1) Color\n2) Engine\n3) Transmission\n4) Engine Horse Power");
            System.out.println("Reply between 1 to 4......");
            rep = in.next().charAt(0);

            switch (rep) {
                case '1':
                    System.out.print("Enter the color: ");
                    color = in.next();
                    break;
                case '2':
                    System.out.print("Enter the Engine Type: ");
                    engineType = in.next();
                    break;
                case '3':
                    System.out.print("Enter the Transmission: ");
                    transmission = in.next();
                    break;
                case '4':
                    System.out.print("Enter the Horse Power: ");
                    horsePower = in.nextInt();
                    break;
                default:
                    System.out.print("Invalid Input! Please reply between 1 to 4......");
                    break;
            }
        } else if (rep == 'n' || rep == 'N') {
            System.out.println("Have a nice day");
        } else {
            System.out.println("Invalid Input! Please reply with y or n......");
        }
    }
}
