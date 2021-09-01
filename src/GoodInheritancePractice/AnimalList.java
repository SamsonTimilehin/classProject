package GoodInheritancePractice;

import GoodInheritancePractice.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    private List<Animal> addUp = new ArrayList<>();

    public void addAnimals(Animal animal){
        addUp.add(new Animal(animal.getName()));
    }
    public void displayAnimal(){
        for(Animal val : addUp){
            System.out.println(val);
        }
    }
}
