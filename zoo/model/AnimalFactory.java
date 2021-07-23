package zoo.model;

public class AnimalFactory implements Animal {
    private String name;
    private Species species;


    public AnimalFactory getAnimal(Species species, String name) {
        AnimalFactory animal;
        switch(species) {
            case LEON: animal = new AnimalFactory(species,name);
            break;
            case GIRAFFE: animal = new AnimalFactory(species, name);
            break;
            case SQUIRREL: animal = new AnimalFactory(species, name);
            break;
            case PENGUIN: animal = new AnimalFactory(species, name);
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


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Species getSpecies() {
        return species;
    }
}
