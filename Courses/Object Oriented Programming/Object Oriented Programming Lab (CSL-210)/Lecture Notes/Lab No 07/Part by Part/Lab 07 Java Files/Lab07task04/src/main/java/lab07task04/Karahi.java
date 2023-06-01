package lab07task04;

public class Karahi extends Pakistani {
    String spiceLevel;
    protected void setspiceLevel(String spiceLevel) {
        this.spiceLevel = spiceLevel;
    }
    public void Display() {
        super.display();
        System.out.println("Spice Level: " + spiceLevel);
    }
}