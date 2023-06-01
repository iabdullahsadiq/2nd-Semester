package lab05;

public class Lab05 {

    public static void main(String[] args) {
        
    	 Rectangle r1 = new Rectangle(4, 5);
    	 Rectangle r2 = new Rectangle(3, 6);
    	 Rectangle r3 = r1.operatorPlus(r2);
    	 System.out.println("Length of rectangle 1: " + r1.getLength() + ", Breadth of rectangle 1: " + r1.getBreadth());
    	 System.out.println("Length of rectangle 2: " + r2.getLength() + ", Breadth of rectangle 2: " + r2.getBreadth());
    	 System.out.println("Length of rectangle 3: " + r3.getLength() + ", Breadth of rectangle 3: " + r3.getBreadth());
    }
}
