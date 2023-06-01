package lab03task02;

public class Sphere {
    
    private double radius;
    
    public double getRadius(){
        return radius;
    }
    public void setRadius (double radius){   
        this.radius = radius;
    }
    public double surfaceArea(){
        return 4*3.142*radius*radius;
    }
    public double volume(){
        return (4/3)*3.142*radius*radius*radius;
    } 
}
