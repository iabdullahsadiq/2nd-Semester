package lab02task02;

import java.util.Scanner;

public class Lab02task02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Computer c1 = new Computer();
        char rep;
        System.out.println("Do you want to open the system?");
        System.out.println("Press y or yes n for no....");
        rep = in.next().charAt(0);

        if (rep == 'y' || rep == 'Y') {
            System.out.println("Loading.......................100%\nprocessing data...............100%\nfinalizing....................100%");
            c1.Display();
            c1.Update();
            c1.Display();
        } else if (rep == 'n' || rep == 'N') {
            System.out.println(" ");
        } else {
            System.out.println("Invalid Input! Please press y or yes n for no....");
        }
    }
}
