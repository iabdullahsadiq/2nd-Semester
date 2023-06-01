package lab07task05;

public class CountedItems extends Items{
    private int quantity;
    public CountedItems(String name, double unitprice, int quantity) {
        super(name, unitprice);
        this.quantity = quantity;
    }
    public double getPrice() {
        return super.getprice() * quantity;
    }
    public String toString() {
        return super.toString() + " (Quantity: " + quantity + ")";
    }
}