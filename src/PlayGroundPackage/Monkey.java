package PlayGroundPackage;

public class Monkey extends Animal{
    private final String name;

    public Monkey(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

//    @Override
//    public String toString() {
//        return "Monkey{" +
//                "name='" + name + '\'' +
//                '}';
//    }
}
