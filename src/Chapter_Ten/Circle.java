package Chapter_Ten;

public class Circle extends TwoDimensionalShape{
    public Circle(double length, double breath, double radius, double height, double base, double pi) {
        super(length, breath, radius, height, base, pi);
    }

    @Override
    public double getArea() {

        return getPi() * (getRadius() * getRadius());
    }
}
