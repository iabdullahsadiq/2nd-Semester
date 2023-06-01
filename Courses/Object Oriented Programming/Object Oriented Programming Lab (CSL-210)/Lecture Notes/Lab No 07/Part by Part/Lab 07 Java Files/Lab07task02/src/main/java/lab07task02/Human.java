package lab07task02;

public class Human {

    private String name;

    public String getName() {
        return name;
    }
    public Human(String name) {
        this.name = name;
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    public void walk() {
        System.out.println(name + " is walking");
    }
    public void talk() {
        System.out.println(name + " is talking");
    }
}
