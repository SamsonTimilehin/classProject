package GoodInheritancePractice;


public class Monkey extends Animal {
    private final String name;

    public Monkey(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


}
