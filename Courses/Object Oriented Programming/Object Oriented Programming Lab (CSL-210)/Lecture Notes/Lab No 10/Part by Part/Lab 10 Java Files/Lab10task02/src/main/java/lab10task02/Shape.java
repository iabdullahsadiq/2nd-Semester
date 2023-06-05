package lab10task02;

abstract class Shape {

    public String name() {
        return getClass().getSimpleName();
    }
    public abstract double area();
    public abstract double perimeter();
    public String toString() {
        return "\n" + name() + "\n  Area=" + area() + "\nPerimeter=" + perimeter();
    }
}