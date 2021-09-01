package Chapter_Ten;

public class Tetrahedron extends ThreeDimensionalShape{
    public Tetrahedron(double length, double breath, double radius, double height, double base, double pi) {
        super(length, breath, radius, height, base, pi);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
