package zoo.model;

import zoo.Zoo;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();

        ZooInitialization zooInit = new ZooInitialization();
        zooInit.getCage().get(0).setAnimal(animalFactory.getAnimal(Species.GIRAFFE, "lol"));
        for(CageImpl c : zooInit.getCage()) {
            System.out.println(c.getAnimal().getName());

        }


    }
}
