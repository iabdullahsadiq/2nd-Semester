package lab12task01;

public class Ellipse extends Shape implements Incentric {
    
    double a, b;

    public Ellipse(double s1, double s2) {
        if (s1 < s2) {
            a = s2;
            b = s1;
        } else {
            a = s1;
            b = s2;
        }
    }
    public double area() {
        //method body missing
        double area = Math.PI * a * b;
        return area;
    }
    public double perimeter() {
        //method body missing
        double perimeter = Math.sqrt((2 * (Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(a - b, 2) / 2));
        return perimeter;
    }
    public void String() {
        System.out.println("Area:" + area() + "\nPerimeter:" + perimeter() + "\nEccentricity:" + eccentricity());
    }
    public double eccentricity() {
        //method body missing
        double eccen = Math.sqrt(1 - (Math.pow(b, 2) / Math.pow(a, 2)));
        return eccen;
    }
}