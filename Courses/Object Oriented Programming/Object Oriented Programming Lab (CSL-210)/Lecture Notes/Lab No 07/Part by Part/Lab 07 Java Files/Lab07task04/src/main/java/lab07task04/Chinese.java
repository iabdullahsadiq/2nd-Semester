package lab07task04;

public class Chinese extends Cuisine {
    private String sauce;
    protected void setSauce(String sauce) {
        this.sauce = sauce;
    }
    public void Display() {
        super.display();
        System.out.println("Sauce: " + sauce);
    }
}