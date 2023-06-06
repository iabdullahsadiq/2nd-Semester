package javaapplication3;

public class Ellipse extends Shape implements IEccentric {

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
    public double Perimeter(){
        return Math.PI*Math.sqrt(2*(Math.pow(this.a,2) + Math.pow(this.b,2)-Math.pow(this.a-this.b,2))/2);
    }
    public double Area(){
        return Math.PI*this.a*this.b;
    }
    public double Eccetricity(){
        return Math.sqrt(1-(Math.pow(this.a,2)/Math.pow(this.b, 2)));
    }
    public String toString(){
        return "Perimeter is " + Perimeter() + "Area is " + Area() + "Eccetricity is " + Eccetricity();
    }
}