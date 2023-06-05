package lab09task02;

public class Lab09task02 {

    public static void main(String[] args) {

        Passenger p1 = new Passenger("Omair", 20);
        Passenger p2 = new Passenger("Ali", 30);
        Passenger p3 = new Passenger("Usman", 10);
        Passenger p4 = new Passenger("Umer", 25);
        Passenger p5 = new Passenger("Muhammad", 29);

        Flight f1 = new Flight("PK-204", "London", new Time(2, 19), new Time(4, 35));
        f1.addPassenger(p1);
        f1.addPassenger(p2);
        f1.addPassenger(p3);
        f1.addPassenger(p4);
        f1.addPassenger(p5);
        f1.printInfo();
    }
}