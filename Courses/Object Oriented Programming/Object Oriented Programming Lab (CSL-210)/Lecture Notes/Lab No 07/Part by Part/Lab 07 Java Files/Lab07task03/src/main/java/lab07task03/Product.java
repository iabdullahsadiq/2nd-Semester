package lab07task03;

public class Product extends Items {
    private String category;
    protected Product(String name, double price, String category) {
        super(name, price);
        this.category = category;
    }
    protected String getCategory() {
        return category;
    }
    protected void setCategory(String category) {
        this.category = category;
    }
}