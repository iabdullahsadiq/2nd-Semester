package com.mycompany.lab01task02;

import java.util.Scanner;

public class Lab01task02 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int opp;
            char rep;
            System.out.println("\n---Arithematic Calculator---");
            System.out.println("\nDo you want to perform any Arithematic Operation?");
            System.out.println(" If yes, reply with y....");
            rep = input.next().charAt(0);

            while (rep == 'y' || rep == 'Y') {
                System.out.println("\nSelect the Operation");
                System.out.println("1) Addition\n2) Substraction\n3) Multiplication\n4) Division\n5) Power\n6) Square Root");
                System.out.println("\nReply between 1 to 6....");
                opp = input.nextInt();
                switch (opp) {
                    case 1:
                        double a,b;
                        double sum;
                        System.out.print("Enter the first number: ");
                        a = input.nextDouble();
                        System.out.print("Enter the second number: ");
                        b = input.nextDouble();
                        sum = a + b;
                        System.out.println("The Sum is: " + sum);
                        System.out.println("\nDo you want to perform any other Operation?");
                        break;
                    case 2:
                        double sub;
                        System.out.print("Enter the first number: ");
                        a = input.nextDouble();
                        System.out.print("Enter the second number: ");
                        b = input.nextDouble();
                        sub = a - b;
                        System.out.println("The Difference is: " + sub);
                        System.out.println("\nDo you want to perform any other Operation?");
                        break;
                    case 3:
                        double prod;
                        System.out.print("Enter the first number: ");
                        a = input.nextDouble();
                        System.out.print("Enter the second number: ");
                        b = input.nextDouble();
                        prod = a * b;
                        System.out.println("The Product is: " + prod);
                        System.out.println("\nDo you want to perform any other Operation?");
                        break;
                    case 4:
                        double divd;
                        System.out.print("Enter the first number: ");
                        a = input.nextDouble();
                        System.out.print("Enter the second number: ");
                        b = input.nextDouble();
                        divd = a / b;
                        System.out.println("The answer is: " + divd);
                        System.out.println("\nDo you want to perform any other Operation?");
                        break;
                    case 5:
                        double power;
                        System.out.print("Enter the number: ");
                        a = input.nextDouble();
                        System.out.print("Enter the Power: ");
                        b = input.nextDouble();
                        power = Math.pow(a, b);
                        System.out.println("The answer is: " + power);
                        System.out.println("\nDo you want to perform any other Operation?");
                        break;
                    case 6:
                        double squareRoot;
                        System.out.print("Enter the number: ");
                        a = input.nextDouble();
                        squareRoot = Math.sqrt(a);
                        System.out.println(String.format("The squareroot of %f is: %f", a, squareRoot));
                        System.out.println("\nDo you want to perform any other Operation?");
                        break;
                    default:
                        System.out.println("Invalid Input! Please reply between 1 to 6....\n");
                        break;
                }
            }
        }
    }
}
