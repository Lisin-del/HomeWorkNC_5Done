package zoo.model;

import zoo.Zoo;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ZooInitialization zooInit = new ZooInitialization();
        ParserCommand parserCommand = new ParserCommand();
        AnimalFactory animalFactory = new AnimalFactory(zooInit);

        while(true) {
            String[] command = parserCommand.enterCommand();
            try {
                animalFactory.checkAnimalZoo(command);
            }
            catch(ArrayIndexOutOfBoundsException exception) {
                System.out.println("Your command is not correct!");
            }
            catch(IllegalArgumentException exception) {
                System.out.println(exception);
            }
        }
    }
}
