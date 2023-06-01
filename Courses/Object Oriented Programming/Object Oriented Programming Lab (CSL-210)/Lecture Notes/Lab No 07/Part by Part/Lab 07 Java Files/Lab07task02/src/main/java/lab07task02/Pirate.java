package lab07task02;

public class Pirate extends Human {

    private String ship;

    public Pirate(String name, String ship) {
        super(name);
        this.ship = ship;
    }
    public void plunder() {
        System.out.println(getName() + " is plundering on ship " + ship);
    }
}
