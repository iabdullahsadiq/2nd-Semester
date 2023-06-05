package lab09task01;

public class Car {

    public Engine engine;
    public Door door;
    public Capacity capacity;
    public Wheel wheel;

    public Car() {
        engine = new Engine();
        door = new Door(5);
        capacity = new Capacity(5);
        wheel = new Wheel(6);
    }
    public void startCar() {
        engine.start();
    }
    public void stopCar() {
        engine.stop();
    }
    public void openDoors() {
        door.open();
    }
    public void closeDoors() {
        door.close();
    }
    public void printCapacity() {
        System.out.println("Seating capacity : " + capacity.getCapacity());
    }
    public void rotateWheels() {
        wheel.rotate();
    }
}