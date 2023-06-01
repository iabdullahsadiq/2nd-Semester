package lab07task03;

public class Pharmacy extends Items {
    private String manufacturer;
    public Pharmacy(String name, double price, String manufacturer) {
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