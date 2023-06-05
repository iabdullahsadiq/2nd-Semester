package lab08task02;

public class Square extends Shape {

    private double length;

    public Square() {
        length = 0;
    }
    public Square(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void getArea() {
        System.out.println("Area of Square is:" + length * length + " meter square");
    }
}