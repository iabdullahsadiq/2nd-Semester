package lab07task01;

public class Rectangle extends Shapes {
    private double height;
    private double width;
    public Rectangle() {
        height = 0;
        width = 0;
    }
    public void setheight(double height) {
        this.height = height;
    }
    public double getheight() {
        return height;
    }
    public void setwidth(double width) {
        this.width = width;
    }
    public double getwidth() {
        return width;
    }
    public void areaonchange() {
        System.out.println("Height is = " + height);
        System.out.println("Width is = " + width);
        area = height * width;
        super.areaonchange();
    }
}