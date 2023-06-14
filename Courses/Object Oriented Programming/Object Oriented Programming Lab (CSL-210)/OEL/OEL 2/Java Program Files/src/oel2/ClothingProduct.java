package oel2;

public class ClothingProduct extends Product {

    ClothingProduct() {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodDescription = prodDescription;
        this.prodBrand = prodBrand;
    }
    @Override
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
}