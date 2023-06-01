package lab02task05;

import java.util.Scanner;

public class Car {

    static Scanner in = new Scanner(System.in);

    String brandName, color;
    double priceNew, priceUsed, odoMeter, milage;

    public void input() {
        System.out.println("Enter the brand of the car: ");
        brandName = in.nextLine();
        System.out.println("Enter the color: ");
        color = in.nextLine();
        System.out.println("Enter the Price when it was new: ");
        priceNew = in.nextDouble();
        System.out.println("Enter the distance trevelled by the car: ");
        odoMeter = in.nextDouble();
    }

    public void getPriceAfterUse() {

        double a, b;
        a = odoMeter / 60000;
        b = 1 - a;
        priceUsed = priceNew * b;
    }

    public void updateMilage() {

        milage = odoMeter * 2;
    }

    public void Output() {
        System.out.println("\nBrand name: " + brandName);
        System.out.println("Color: " + color);
        System.out.println("Actual price: " + priceNew);
        System.out.println("Price after use: " + priceUsed);
        System.out.println("Odometer Reading: " + milage);
    }
}
