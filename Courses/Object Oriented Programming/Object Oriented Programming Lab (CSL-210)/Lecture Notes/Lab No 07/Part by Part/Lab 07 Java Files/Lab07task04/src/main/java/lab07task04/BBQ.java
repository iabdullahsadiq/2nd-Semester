package lab07task04;

public class BBQ extends Cuisine {
    private String sauce;
    protected void setSauce(String sauce) {
        this.sauce = sauce;
    }
    public void Display() {
        super.display();
        System.out.println("Sauce: " + sauce);
    }
}