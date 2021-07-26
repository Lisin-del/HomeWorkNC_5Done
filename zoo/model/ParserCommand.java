package zoo.model;

import zoo.Zoo;

import java.util.Locale;
import java.util.Scanner;

public class ParserCommand {
    private Scanner in = new Scanner(System.in);
    private String commandUser;
    private String[] command;
    private String split = " ";
    private Zoo zoo;

    public String[] enterCommand() {
        System.out.print("Enter your command: ");
        commandUser = in.nextLine();
        command = commandUser.split(split);
        return command;
    }

    public Species speciesAnimal(String[] command) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Species species;
        switch(command[1].toLowerCase()) {
            case("leon") : species = Species.LEON;
            break;
            case("giraffe") : species = Species.GIRAFFE;
            break;
            case("squirrel") : species = Species.SQUIRREL;
            break;
            case("penguin") : species = Species.PENGUIN;
            break;
            default: throw new IllegalArgumentException("Type is not correct!");
        }
        return species;
    }






}
