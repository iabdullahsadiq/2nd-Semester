package lab07task04;

public class FastFood extends Cuisine {
    private String category;
    protected void setCategory(String category) {
        this.category = category;
    }
    public void Display() {
        super.display();
        System.out.println("Category: " + category);
    }
}