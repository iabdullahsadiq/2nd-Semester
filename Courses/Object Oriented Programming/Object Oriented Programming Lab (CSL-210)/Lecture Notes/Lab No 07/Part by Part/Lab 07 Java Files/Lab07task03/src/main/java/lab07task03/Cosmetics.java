package lab07task03;

public class Cosmetics extends Items {
    private String brand;
    public Cosmetics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }
    protected void setbrand(String brand) {
        this.brand = brand;
    }
    protected String getbrand() {
        return brand;
    }
}