package com.mycompany.lab01basicsyntax;

import java.util.Scanner;

public class Lab01BasicSyntax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the mumber of items");
        int number = input.nextInt();
        int[] items = new int[number];
        int total = 0;

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the name of item " + (i + 1));
            String name = input.next();
            System.out.println("Enter the price of item " + (i + 1));
            int price = input.nextInt();
            total = total + items[i];
        }
        System.out.println("Are you from Bahria University");
        char rep = input.next().charAt(0);
        if (rep == 'Y' || rep == 'y') {
            double finalPrice = total * (0.3);
            System.out.println("Your final bill is " + finalPrice);

        } else if (total >= 50000 || total <= 100000) {
            double finalPrice = total * (0.2);
            System.out.println("Your final bill is " + finalPrice);

        } else if (total >= 100000) {
            double finalPrice = total * (0.3);
            System.out.println("Your final bill is " + finalPrice);
        }
    }
}
