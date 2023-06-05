package lab10task02;

public class EquilateralTriangle extends Shape {

    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }
    public double area() {
        return 0.25 * 1.73 * side * side;
    }
    public double perimeter() {
        return 3 * side;
    }
    public double getside() {
        return side;
    }
}