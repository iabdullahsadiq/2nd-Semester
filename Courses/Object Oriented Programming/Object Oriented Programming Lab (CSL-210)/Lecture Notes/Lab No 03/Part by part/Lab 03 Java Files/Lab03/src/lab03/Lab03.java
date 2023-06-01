package lab03;

public class Lab03 {

    public static void main(String[] args) {
        
        Cylinder c1 = new Cylinder();
        c1.setHeight (9.0);
        c1.setRadius (3.0);
        
        System.out.println("Radius is "+c1.getRadius());
        System.out.println("Height is "+c1.getHeight());
        System.out.println("Surface Area is "+c1.surfaceArea());
        System.out.println("Volume is "+c1.volume());
    }
}
