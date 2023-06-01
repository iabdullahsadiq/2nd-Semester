package lab07task03;

public class Fresh extends Product {
    private String expirydate;
    public Fresh(String name, double price, String category, String expirydate) {
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