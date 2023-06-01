package lab07task02;

public class Lab07task02 {

    public static void main(String[] args) {

        Human human = new Human("John");
        human.sleep();
        human.walk();
        human.talk();

        Alien alien = new Alien("Zorg", "Xenon");
        alien.sleep();
        alien.walk();
        alien.talk();
        alien.teleport();

        Pirate pirate = new Pirate("Blackbeard", "Queen Anne's Revenge");
        pirate.sleep();
        pirate.walk();
        pirate.talk();
        pirate.plunder();
    }
}
