package lab07task04;

public class Pakistani extends Cuisine {
    private String type;
    protected void settype(String type) {
        this.type = type;
    }
    public void Display() {
        super.display();
        System.out.println("Type: " + type);
    }
}