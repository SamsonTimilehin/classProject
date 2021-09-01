package Chapter_Ten;

public class Cube extends ThreeDimensionalShape{
    public Cube(double length, double breath, double radius, double height, double base, double pi) {
        super(length, breath, radius, height, base, pi);
    }

    @Override
    public double getArea() {
        return 6 * (getLength() * getLength());
    }

    @Override
    public double getVolume() {

        return getLength() * getLength() * getLength();
    }
}
