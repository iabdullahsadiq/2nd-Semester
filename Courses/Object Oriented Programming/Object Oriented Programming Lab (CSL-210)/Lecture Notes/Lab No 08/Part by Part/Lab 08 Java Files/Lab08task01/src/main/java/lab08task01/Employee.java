package lab08task01;

public class Employee {

    private String fName;
    private String lName;
    private String CNIC;

    public Employee() {
        fName = "Not Available";
        lName = "Not Available";
        CNIC = "0";
    }
    public Employee(String fName, String lName, String CNIC) {
        this.fName = fName;
        this.lName = lName;
        this.CNIC = CNIC;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getCNIC() {
        return CNIC;
    }
    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }
    public String tostring() {
        return fName + " " + lName + " CNIC# " + CNIC;
    }
    public double earnings() {
        return 0.00;
    }
}