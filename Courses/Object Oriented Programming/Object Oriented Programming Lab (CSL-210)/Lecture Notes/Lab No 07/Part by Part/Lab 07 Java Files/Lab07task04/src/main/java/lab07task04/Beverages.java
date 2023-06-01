package lab07task04;

public class Beverages extends Cuisine{
    private String brand;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void Display() {
        super.display();
        System.out.println("Brand: " + brand);
    }
}