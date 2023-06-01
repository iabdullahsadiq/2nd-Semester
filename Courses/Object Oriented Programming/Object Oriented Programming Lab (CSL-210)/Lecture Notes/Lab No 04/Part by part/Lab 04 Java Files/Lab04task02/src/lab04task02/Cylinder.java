package lab04task02;

public class Cylinder {   
    private int height;
    private int radius;
    
    Cylinder (int radius, int height){
        
        this.radius = radius;
        this.height = height;
    }
    public Double surfaceArea(){
        return 2*3.142*radius*radius+3.142*radius*height;
    }
    public Double volume(){
        return 3.142*radius*radius*height; 
    } 
}
