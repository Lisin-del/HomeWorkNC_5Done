package zoo.model;

import java.util.Locale;

public class AnimalFactory implements Animal {
    private String name;
    private Species species;
    private ZooInitialization zooInit;
    private ZooImpl zoo;

    public AnimalFactory getAnimal(String species, String name) {
        AnimalFactory animal;
        switch(species.toLowerCase()) {
            case "leon": animal = new AnimalLeon(Species.LEON,name);
            break;
            case "giraffe": animal = new AnimalGiraffe(Species.GIRAFFE, name);
            break;
            case "squirrel": animal = new AnimalSquirrel(Species.SQUIRREL, name);
            break;
            case "penguin": animal = new AnimalPenguin(Species.PENGUIN, name);
            break;
            default: throw new IllegalArgumentException("Type is not correct!");
        }
        return animal;
    }

    public AnimalFactory(Species species, String name) {
        this.species = species;
        this.name = name;
    }

    public AnimalFactory(String name) {
        this.name = name;
    }

    public AnimalFactory() {

    }

    public AnimalFactory(ZooInitialization zooInit) {
        this.zooInit = zooInit;
        this.zoo = new ZooImpl(zooInit);
    }

    public void checkAnimalZoo(String[] command) {
        AnimalFactory animalFactory = new AnimalFactory();
        switch(command[0]) {
            case("check-in") : Animal animal = animalFactory.getAnimal(command[1], command[2]);
            zoo.checkInAnimal(animal);
            break;
            case("check-out") : Animal animalCheckOut = new AnimalFactory(command[1]);
            zoo.checkOutAnimal(animalCheckOut);
            break;
            case ("log") : System.out.println(zoo.getHistory());
            break;
            default: throw new IllegalArgumentException("Command is not correct!");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Species getSpecies() {
        return species;
    }
}
