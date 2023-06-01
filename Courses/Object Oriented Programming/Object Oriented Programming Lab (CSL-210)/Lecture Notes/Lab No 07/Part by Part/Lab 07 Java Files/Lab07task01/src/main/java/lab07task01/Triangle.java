package lab07task01;

public class Triangle extends Shapes {
    private double base;
    private double height;
    public Triangle() {
        base = 0;
        height = 0;
    }
    public void setbase(double base) {
        this.base = base;
    }
    public void setheight(double height) {
        this.height = height;
    }
    public double getbase() {
        return base;
    }
    public double getheight() {
        return height;
    }
    public void areaonchange() {
        System.out.println("Base = " + base);
        System.out.println("Hieght = " + height);
        area = 0.5 * height * base;
        super.areaonchange();
    }
}