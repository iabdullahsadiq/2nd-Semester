package lab07task05;

public class WeightedItems extends Items {
    private double weight;
    public WeightedItems(String name, double unitprice, double weight) {
        super(name, unitprice);
        this.weight = weight;
    }
    public double getprice() {
        return super.getprice() * weight;
    }
    public String toString() {
        return super.toString() + "(Weight " + weight + " kg)";
    }
}