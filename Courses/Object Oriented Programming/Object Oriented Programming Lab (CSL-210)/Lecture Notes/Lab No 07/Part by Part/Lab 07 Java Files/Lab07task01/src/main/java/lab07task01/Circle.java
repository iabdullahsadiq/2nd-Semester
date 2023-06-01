package lab07task01;

public class Circle extends Shapes {
    private double radius;
    private double pi;
    public Circle() {
        radius = 0;
        pi = 3.142;
    }
    public void setradius(double radius) {
        this.radius = radius;
    }
    public double getradius() {
        return radius;
    }
    public void areaonchange() {
        System.out.println("radius = " + radius);
        area = pi * (radius * radius);
        super.areaonchange();
    }
}