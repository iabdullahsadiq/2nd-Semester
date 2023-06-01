package lab07task02;

public class Alien extends Human {

    private String planet;

    public Alien(String name, String planet) {
        super(name);
        this.planet = planet;
    }
    public void teleport() {
        System.out.println(getName() + " is teleporting from planet " + planet);
    }
}
