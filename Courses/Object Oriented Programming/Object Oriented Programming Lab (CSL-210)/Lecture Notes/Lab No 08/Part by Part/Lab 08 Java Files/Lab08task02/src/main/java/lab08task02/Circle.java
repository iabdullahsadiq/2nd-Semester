package lab08task02;

public class Circle extends Shape {

    private double radius, pi = 3.142;

    Circle() {
        radius = 0;
    }
    Circle(double radius) {
        this.radius = radius;
    }
    public void getArea() {
        System.out.println("\nArea of the circle is:" + pi * radius * radius + " meters square");
    }
}