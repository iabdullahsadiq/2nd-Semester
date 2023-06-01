package lab07task03;

public class Frozen extends Product {
    private String expirydate;
    public Frozen(String name, double price, String category, String expirydate) {
        super(name, price, category);
        this.expirydate = expirydate;
    }
    protected void setexpirydate(String brand) {
        this.expirydate = expirydate;
    }
    protected String getexpirydate() {
        return expirydate;
    }
}