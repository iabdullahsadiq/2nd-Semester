package lab07task04;

public class Biryani extends Pakistani {
    private String meat;
    protected void setmeat(String meat) {
        this.meat = meat;
    }
    public void Display() {
        super.display();
        System.out.println("Meat Type: " + meat);
    }
}