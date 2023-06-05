package lab09task02;

public class Time {
    int hours;
    int minute;
    public Time() {
    }
    Time(int hours, int minute) {
        this.hours = hours;
        this.minute = minute;
    }
    public int getHours() {
        return hours;
    }
    public int getMinute() {
        return minute;
    }
}