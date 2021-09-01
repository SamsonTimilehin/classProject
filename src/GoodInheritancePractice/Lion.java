package GoodInheritancePractice;

import GoodInheritancePractice.Animal;

public class Lion extends Animal {

    private final String name;

    public Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

//    @Override
//    public String toString() {
//        return "Lion{" +
//                "name='" + name + '\'' +
//                '}';
//    }
}
