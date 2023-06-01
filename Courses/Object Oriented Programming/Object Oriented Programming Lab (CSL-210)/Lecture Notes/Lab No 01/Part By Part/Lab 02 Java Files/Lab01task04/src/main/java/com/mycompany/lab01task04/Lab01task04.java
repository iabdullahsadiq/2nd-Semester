package com.mycompany.lab01task04;

import java.util.Scanner;

public class Lab01task04 {

    static Scanner input = new Scanner(System.in);

    static double calculatePressure() {
        double p, m, t, v, a, b;

        System.out.println("\n---Automobile Tyre Pressure Calculator---");
        System.out.println("Enter the Mass of air in pounds:");
        m = input.nextDouble();
        System.out.println("Enter Temperature in Fahrenheit:");
        t = input.nextDouble();
        System.out.println("Enter Volume in cubic feet:");
        v = input.nextDouble();

        a = m * (t + 460);
        b = 0.37 / v;
        p = a * b;
        return p;
    }

    static double calculateRPM2() {
        double RPM2, a, d1, d2, RPM1;

        System.out.println("\n---Two pulleys System---");
        System.out.println("Enter the diameter of Pulley 1 (in meter):");
        d1 = input.nextDouble();
        System.out.println("Enter the Speed of Pulley 1 (in RPM):");
        RPM1 = input.nextDouble();
        System.out.println("Enter the diameter of Pulley 2 (in meter):");
        d2 = input.nextDouble();
        a = d1 / d2;
        RPM2 = a * RPM1;
        return RPM2;
    }

    static double calculateWeight() {

        double force, weight;
        int ropes;

        System.out.println("\n---Multiple pulleys System---");
        System.out.println("Enter the Force exerted (in Newtons):");
        force = input.nextDouble();
        System.out.println("Enter the number of Ropes:");
        ropes = input.nextInt();

        weight = force * ropes;
        return weight;
    }

    static double calculateBMI() {

        double BMI, a, m, h;

        System.out.println("\n---Body Mass Index---");
        System.out.println("Enter your weight in Pounds:");
        m = input.nextDouble();
        System.out.println("Enter your height in inches:");
        h = input.nextDouble();
        a = m / (h * h);
        BMI = a * 703;
        return BMI;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char rep;
        System.out.println("What do you want to calculate?");
        System.out.println("a) Automobile Pressure\nb) Pulley systems\nc) Body Mass Index (BMI)");
        System.out.println("\nReply with a,b or c......");

        rep = input.next().charAt(0);

        switch (rep) {
            case 'a':
                System.out.println(String.format("Pressure is %,.2f psi", calculatePressure()));
                break;

            case 'b':
                int rep1;
                System.out.println("\n---Pulley Systems---");
                System.out.println("How many pulleys are there in your system:");
                System.out.println("1) Only two Pulleys. \n2) Multiple Pulleys.");
                System.out.println("Reply with 1 or 2.....");
                rep1 = input.nextInt();
                if (rep1 == 1) {
                    System.out.println(String.format("The speed of 2nd Pulley is %,.2f RPM", calculateRPM2()));
                } else if (rep1 == 2) {
                    System.out.println(String.format("The total weight that can be lifted with Pulley system is %,.2f KG", calculateWeight()));
                } else {
                    System.out.println("Invalid Input! Please Reply with 1 or 2......");
                }
                break;

            case 'c': {
                System.out.println(String.format("The value of BMI is %,.2f Kg/m-square", calculateBMI()));
            }
            default:
                System.out.println("Invalid Input! Please Reply with a, b or c......");
                break;
        }
    }
}
