package lab04task02;

public class Lab04task02 {

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(9,13);
        
        System.out.print("Surface Area: ");
        System.out.println(c1.surfaceArea());
        System.out.print("Volume: ");
        System.out.println(c1.volume());
    }
}
