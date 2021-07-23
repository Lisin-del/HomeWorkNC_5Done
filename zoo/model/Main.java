package zoo.model;

import zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        ZooImpl zoo = new ZooImpl();
        AnimalFactory animal = new AnimalFactory();
        ParserCommand parser = new ParserCommand(zoo);
        String command[];
        while (true) {
            command = parser.enterCommand();
            parser.checkCommand(command, animal);
        }

    }
}
