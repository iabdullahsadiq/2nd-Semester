package lab09task01;

public class Door {

    private int no_doors;

    public Door(int no_doors) {
        this.no_doors = no_doors;
    }
    public int getNo_doors() {
        return no_doors;
    }
    public void open() {
        System.out.println("Doors is Open");
    }
    public void close() {
        System.out.println("Doors is Close");
    }
}