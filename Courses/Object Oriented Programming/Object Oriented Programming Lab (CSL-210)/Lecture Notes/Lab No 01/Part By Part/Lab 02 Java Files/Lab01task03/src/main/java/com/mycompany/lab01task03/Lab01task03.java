package com.mycompany.lab01task03;

import java.util.Scanner;

public class Lab01task03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double amount, discount, total = 0;

        System.out.print("Enter the mumber of items you have purchased: ");
        int number = input.nextInt();
        int price[] = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the name of item " + (i + 1));
            String items = input.next();
            System.out.println("Enter the price ");
            price[i] = input.nextInt();
            total = total + price[i];
        }

        System.out.println("\nAre you from Bahria University?");
        System.out.println(" If yes, reply with y otherwise n....");
        char rep = input.next().charAt(0);
        if (rep == 'y' || rep == 'Y') {
            discount = total * (0.3);
            amount = total - discount;
            System.out.println(String.format("\nYour final bill is %f Rs with 30 Percent Discount.", amount));
        } else if (rep == 'n' || rep == 'N') {
            if (total >= 50000 && total <= 100000) {
                discount = total * (0.2);
            } else if (total >= 100000) {
                discount = total * (0.3);
            } else {
                discount = 0;
            }
            amount = total - discount;
            System.out.println(String.format("\nYour final bill is %f Rs with the discount of Rs %f.", amount, discount));
        } else {
            System.out.println(" Invalid Input! Please reply with y or n....");
        }
    }
}
