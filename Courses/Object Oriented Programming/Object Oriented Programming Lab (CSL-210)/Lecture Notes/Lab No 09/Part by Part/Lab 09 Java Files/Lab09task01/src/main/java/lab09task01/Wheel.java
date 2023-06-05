package lab09task01;

public class Wheel {

    private int wheel;

    public Wheel(int wheel) {
        this.wheel = wheel;
    }
    public int getWheel() {
        return wheel;
    }
    public void rotate() {
        System.out.println("Wheel is Rotating");
    }
}