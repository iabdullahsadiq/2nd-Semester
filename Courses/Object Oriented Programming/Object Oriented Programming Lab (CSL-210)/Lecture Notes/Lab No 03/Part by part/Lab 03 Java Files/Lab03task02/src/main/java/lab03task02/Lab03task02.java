package lab03task02;

public class Lab03task02 {

    public static void main(String[] args) {

        Sphere s1 = new Sphere();
        s1.setRadius(3.0);

        System.out.println("Radius is " + s1.getRadius());
        System.out.println("Surface Area is " + s1.surfaceArea());
        System.out.println("Volume is " + s1.volume());

    }
}
