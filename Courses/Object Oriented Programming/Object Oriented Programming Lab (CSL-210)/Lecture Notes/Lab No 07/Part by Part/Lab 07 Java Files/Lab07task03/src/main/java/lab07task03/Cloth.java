package lab07task03;

public class Cloth extends Items {
    private String material;
    public Cloth(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }
    protected void setmaterial(String material) {
        this.material = material;
    }
    protected String getmaterial() {
        return material;
    }
}