package zoo.model;

import zoo.Zoo;

import java.util.Scanner;

public class ParserCommand {
    private Scanner in = new Scanner(System.in);
    private String commandUser;
    private String[] command;
    private String split = " ";
    private Zoo zoo;

    public ParserCommand(Zoo zoo) {
        this.zoo = zoo;
    }


    public String[] enterCommand() {
        System.out.print("Enter your command: ");
        commandUser = in.nextLine();
        command = commandUser.split(split);
        return command;
    }

    public void checkCommand(String[] command, AnimalFactory animal) {
        if(command[0].equalsIgnoreCase("check-in")) {
            switch(command[1]) {
                case "leon" : AnimalFactory animalLeon = animal.getAnimal(Species.LEON, command[2]);
                zoo.checkInAnimal(animalLeon);
                break;
                case "giraffe" : AnimalFactory animalGiraffe = animal.getAnimal(Species.GIRAFFE, command[2]);
                zoo.checkInAnimal(animalGiraffe);
                break;
                case "squirrel" : AnimalFactory animalSquirrel = animal.getAnimal(Species.SQUIRREL, command[2]);
                zoo.checkInAnimal(animalSquirrel);
                break;
                case "penguin" : AnimalFactory animalPenguin = animal.getAnimal(Species.PENGUIN, command[2]);
                zoo.checkInAnimal(animalPenguin);
                break;
                default : System.out.println("Animal type is not correct!");
            }
        }
        else if(command[0].equalsIgnoreCase("check-out")) {
            animal = new AnimalFactory(command[1]);
            zoo.checkOutAnimal(animal);
        }
        else if(command[0].equalsIgnoreCase("log")) {
            System.out.println(zoo.getHistory());
        }
        else {
            System.out.println("Your command is not correct!\n" +
                    "Use these command:\n" +
                    "<check-in> [animal-type] [animal-name]\n" +
                    "<check-out> [animal-name]\n" +
                    "<log>");
        }
    }




}
