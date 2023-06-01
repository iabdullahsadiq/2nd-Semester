package lab07task04;

public class Cuisine {
    private String name, style;
    private int quantity;
    private double price;
    protected void setname(String name) {
        this.name = name;
    }
    protected void setquantity(int quantity) {
        this.quantity = quantity;
    }
    protected void setStyle(String style) {
        this.style = style;
    }
    protected void setprice(double price) {
        this.price = price;
    }
    protected void display() {
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Style: " + style);
    }
}