package lab08task02;

public class Rectangle extends Square{

    private double width;

    Rectangle() {
        super();
        width = 0;
    }
    Rectangle(double length, double width) {
        super(length);
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void getArea() {
        System.out.println("\nArea of Rectangle is:" + getLength() * getWidth() + " meters square");
    }
}