package lab04task04;

public class Flight {

    String fno, source, destination;
    int aseat;

    public Flight(String fno, String source, String destination, int aseat) {
        this.fno = fno;
        this.source = source;
        this.destination = destination;
        this.aseat = aseat;
    }
    public Flight(String fno, int aseat) {
        this.fno = fno;
        this.source = "";
        this.destination = "";
        this.aseat = aseat;
    }
    public Flight(String fno) {
        this.fno = fno;
        this.source = "";
        this.destination = "";
        this.aseat = 0;
    }
    public void reserve(int noofseats) {
        if (this.aseat > 0) {
            aseat = aseat - noofseats;
            System.out.println(noofseats + " have been booked");
        } else {
            System.out.println("SEATS ARE NOT AVAILABLE AT CURRENT MOMENT.");
        }
    }
    public void cancel(int noofseat) {
        if ((aseat > 0) && (aseat <= noofseat)) {
            aseat = -noofseat;
            System.out.println(noofseat + " HAVE BEEN CANCELLED");
        } else {
            System.out.println("YOU HAVE ENTERED INVALID NO OF SEATS.");
        }
    }
    public String tostring() {
        return ("FLIGHT " + this.fno + " FROM SOURCE " + this.source + " TO DESTINATION " + this.destination);
    }
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Flight)) {
            return false;
        }
        Flight otherFlight = (Flight) obj;
        return (this.fno.equals(otherFlight.fno));
    }
    private String shortAndCapital(String name) {
        if (name.length() <= 3) {
            return name.toUpperCase();
        } else {
            return name.substring(0, 3).toUpperCase();
        }
    }
}
