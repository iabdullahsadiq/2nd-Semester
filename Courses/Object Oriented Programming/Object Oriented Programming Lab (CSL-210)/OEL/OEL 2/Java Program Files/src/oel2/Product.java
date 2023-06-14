package oel2;

public abstract class Product {

    String prodName;
    double prodPrice;
    String prodDescription;
    String prodBrand;

    Product() {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodDescription = prodDescription;
        this.prodBrand = prodBrand;
    }
    public void getName() {
        this.prodName = prodName;
    }
    public void getPrice() {
        this.prodPrice = prodPrice;
    }
    public void getDescription() {
        this.prodDescription = prodDescription;
    }
    public void getBrand() {
        this.prodBrand = prodBrand;
    }
    private String setName() {
        return  prodName;
    }
    private double setPrice() {
        return  prodPrice;
    }
    private String setDescription() {
        return  prodDescription;
    }
    private String setBrand() {
        return  prodBrand;
    }
    public void calculateTotalPrice() {

    }
    public void displayDetails() {

    }
    public void discount() {

    }
}