package PlayGroundPackage;

public class AnimalDriverClass {

    public static void main(String[] args) {

        Animal lion = new Lion("Tom Lion");
        Animal monkey = new Monkey("Monkey Tee");
        Animal monkey2 = new Monkey("Nice monkey");

       AnimalList animalList = new AnimalList();
       animalList.addAnimals(lion);
       animalList.addAnimals(monkey);
       animalList.addAnimals(lion);
       animalList.addAnimals(monkey2);
       animalList.displayAnimal();

    }
}
