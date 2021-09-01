package Chapter_Ten;

public class Square extends TwoDimensionalShape{
    public Square(double length, double breath, double radius, double height, double base, double pi) {
        super(length, breath, radius, height, base, pi);
    }

    @Override
    public double getArea() {
        double areaOfSquare = getLength() * getLength();
        return areaOfSquare;
    }
}
