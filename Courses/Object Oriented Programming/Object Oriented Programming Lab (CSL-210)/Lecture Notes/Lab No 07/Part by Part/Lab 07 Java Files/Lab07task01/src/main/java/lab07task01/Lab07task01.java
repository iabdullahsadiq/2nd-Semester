package lab07task01;

public class Lab07task01 {

    public static void main(String[] args) {
        
        System.out.println("           Area of Circle          ");
        Circle c1 = new Circle();
        c1.setradius(4.2);
        c1.areaonchange();
        System.out.println("           Area of Rectangular          ");
        Rectangle r1 = new Rectangle();
        r1.setheight(20);
        r1.setwidth(19);
        r1.areaonchange();
        System.out.println("           Area of Triangle          ");
        Triangle t1 = new Triangle();
        t1.setbase(23);
        t1.setheight(40);
        t1.areaonchange(); 
    }
}
