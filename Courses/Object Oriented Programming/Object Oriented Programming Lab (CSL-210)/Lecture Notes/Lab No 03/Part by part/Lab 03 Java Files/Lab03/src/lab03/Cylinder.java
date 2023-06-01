package lab03;

public class Cylinder {
    private double height;
    private double radius;
    
    public double getRadius(){
        return radius;
    }
    public void setRadius (double radius){      
        this.radius = radius;
    }
     public double getHeight(){
        return height;
    }
    public void setHeight (double height){       
        this.height = height;
    }
    public double surfaceArea(){
        return 2*3.142*radius*radius+2*3.142*radius*height;
    }
    public double volume(){
        return 3.142*radius*radius*height;
    }
}
