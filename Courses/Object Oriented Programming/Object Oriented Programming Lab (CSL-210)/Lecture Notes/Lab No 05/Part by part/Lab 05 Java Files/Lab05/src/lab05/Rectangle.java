package lab05;

public class Rectangle {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public double getLength() {
		return length;
	}
	public double getBreadth() {
		return breadth;
	}
	public Rectangle operatorPlus(Rectangle other) {
		double newLength = this.length + other.getLength();
		double newBreadth = this.breadth + other.getBreadth();
		return new Rectangle(newLength, newBreadth);
	}
}
