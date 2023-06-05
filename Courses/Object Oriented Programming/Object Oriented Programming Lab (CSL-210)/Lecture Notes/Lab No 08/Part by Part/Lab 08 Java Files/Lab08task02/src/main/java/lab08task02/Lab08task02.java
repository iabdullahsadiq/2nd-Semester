package lab08task02;

public class Lab08task02 {

    public static void main(String[] args) {

        Shape s1 = new Square(15);
        s1.getArea();
        Shape s2 = new Rectangle(35, 15);
        s2.getArea();
        Shape s3 = new Circle(23.5);
        s3.getArea();
    }
}