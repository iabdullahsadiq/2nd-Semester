package lab09task02;
import java.util.*;
public class Flight {

    String flight_no;
    String destination;
    Time departuretime;
    Time arrivaltime;
    private List<Passenger> passengerList = new ArrayList<Passenger>();

    Flight(String flight_no, String destination, Time departuretime, Time arrivaltime) {
        this.flight_no = flight_no;
        this.destination = destination;
        this.departuretime = departuretime;
        this.arrivaltime = arrivaltime;

    }
    public void addPassenger(Passenger p) {
        this.passengerList.add(p);
    }
    public void printInfo() {
        System.out.println("Flight : " + flight_no);
        System.out.println("Destination : " + destination);
        System.out.println("Departure : " + timeconvert(departuretime));
        System.out.println("Arrival : " + timeconvert(arrivaltime));
        System.out.println("Number of passengers : " + passengerList.size());
    }

    public String timeconvert(Time t) {
        return String.format("%d:%d", t.hours, t.minute);
    }
}