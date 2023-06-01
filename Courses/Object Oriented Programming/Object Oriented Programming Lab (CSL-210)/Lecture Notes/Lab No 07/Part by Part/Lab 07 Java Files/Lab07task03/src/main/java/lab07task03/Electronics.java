package lab07task03;

public class Electronics extends Items {
    private String manufacturer;
    protected Electronics(String name, double price, String manufacturer) {
        super(name, price);
        this.manufacturer = manufacturer;
    }
    protected void setmanufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    protected String getmanufacturer() {
        return manufacturer;
    }
}