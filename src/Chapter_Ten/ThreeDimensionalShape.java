package Chapter_Ten;

public abstract class ThreeDimensionalShape extends Shape{


    public ThreeDimensionalShape(double length, double breath, double radius, double height, double base, double pi) {
        super(length, breath, radius, height, base, pi);
    }

    public abstract double getArea();
    public abstract double getVolume();
}
