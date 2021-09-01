package Chapter_Ten;

public class Triangle extends TwoDimensionalShape{
    public Triangle(double length, double breath, double radius, double height, double base, double pi) {
        super(length, breath, radius, height, base, pi);
    }

    @Override
    public double getArea() {

        return 1 * (getBase() * getHeight())/2;
    }
}
