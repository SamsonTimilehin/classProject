package Chapter_Ten;

public class Sphere extends ThreeDimensionalShape{
    public Sphere(double length, double breath, double radius, double height, double base, double pi) {
        super(length, breath, radius, height, base, pi);
    }

    @Override
    public double getArea() {

        return  4 * getPi() * getRadius() * getRadius();
    }

    @Override
    public double getVolume() {

        return 4 * (getPi() * getRadius() * getRadius() * getRadius())/3;
    }
}
