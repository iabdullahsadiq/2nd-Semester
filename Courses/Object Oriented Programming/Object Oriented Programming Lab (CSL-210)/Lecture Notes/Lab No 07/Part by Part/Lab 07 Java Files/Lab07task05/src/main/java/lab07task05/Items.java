package lab07task05;

public class Items {
    private String name;
    private double unitprice;
    public Items(String name, double unitprice) {
        this.name = name;
        this.unitprice = unitprice;
    }
    public Items() {
        this("no items", 0.0);
    }
    protected double getprice() {
        return unitprice;
    }
    protected String getname() {
        return name;
    }
    protected void setname(String name) {
        this.name = name;
    }
    protected void setunitprice(double price) {
        this.unitprice = unitprice;
    }
    protected double getunitprice() {
        return unitprice;
    }
    public String toString() {
        return name + " @ Unitprice:" + unitprice;
    }
}