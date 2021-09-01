package Chapter_Ten;

public class Shape {

    private double length;
    private double breath;
    private double radius;
    private double height;

    public Shape(double length, double breath, double radius, double height, double base, double pi) {
        this.length = length;
        this.breath = breath;
        this.radius = radius;
        this.height = height;
        this.base = base;
        this.pi = pi;
    }

    private double base;
    private double pi;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }
}
