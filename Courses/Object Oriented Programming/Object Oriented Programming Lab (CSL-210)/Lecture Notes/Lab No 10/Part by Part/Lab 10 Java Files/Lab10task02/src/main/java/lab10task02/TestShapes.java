package lab10task02;
import java.util.*;
public class TestShapes {

    public static Shape[] createShape() {
        final int SIZE = 5;
        final double DIMENSION = 100;
        final int NUMBEROFSHAPES = 4;
        //final int assigner = 3;


        Random generator = new Random();

        Shape[] randomShapes = new Shape[generator.nextInt(SIZE) + 1];

        for (int i = 0; i < randomShapes.length; i++) {

            switch (assigner) {
                case 0:
                    randomShapes[i] = new Rectangle(generator.nextDouble() * DIMENSION, generator.nextDouble() * DIMENSION);
                    break;
                case 1:
                    randomShapes[i] = new Circle(generator.nextDouble() * DIMENSION);
                    break;
                case 2:
                    randomShapes[i] = new Square(generator.nextDouble() * DIMENSION);
                    break;
                case 3:
                    randomShapes[i] = new EquilateralTriangle(generator.nextDouble() * DIMENSION);
                    break;
            }
        }
        return randomShapes;
    }
    public static void main(String[] args) {
        Shape[] randomShapes = TestShapes.createShape();
        for (int i = 0; i < randomShapes.length; i++) {
            System.out.println(randomShapes[i].toString());
        }
    }
}