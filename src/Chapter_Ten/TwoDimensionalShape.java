package Chapter_Ten;

public abstract class TwoDimensionalShape extends Shape {


    public TwoDimensionalShape(double length, double breath, double radius, double height, double base, double pi) {
        super(length, breath, radius, height, base, pi);
    }

    public abstract double getArea();
}
