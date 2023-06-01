package lab07task01;

public class Shapes {
    double area;
    public Shapes() {
        area = 0;
    }
    public double getarea(double area) {
        this.area = area;
        return area;
    }
    public void areaonchange() {
        System.out.println("area is = " + area);
    }
}