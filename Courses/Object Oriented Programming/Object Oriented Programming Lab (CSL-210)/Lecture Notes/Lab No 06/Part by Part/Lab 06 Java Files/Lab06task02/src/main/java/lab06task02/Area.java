package lab06task02;

public class Area {

    public void area(int side) {
        int area = side * side;
        System.out.println("area of square is: " + area);
    }
    public void area(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + " is: "+ area);
    }
}
