package lab07task03;

public class Items {
    private String name;
    private double price;
    protected Items(String name, double price) {
        this.name = name;
        this.price = price;
    }
    protected void setname(String name) {
        this.name = name;
    }
    protected String getname() {
        return name;
    }
    protected void setprice(double price) {
        this.price = price;
    }
    protected double getprice() {
        return price;
    }
}