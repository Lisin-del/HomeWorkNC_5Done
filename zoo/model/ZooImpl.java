package zoo.model;

import zoo.InhibitionLog;
import zoo.Zoo;

import java.util.Date;
import java.util.List;

public class ZooImpl implements Zoo {
    private Condition conditionForCageOne = new ConditionImpl(Species.LEON);
    private Condition conditionForCageTwo = new ConditionImpl(Species.GIRAFFE);
    private Condition conditionForCageThree = new ConditionImpl(Species.SQUIRREL);
    private Condition conditionForCageFour = new ConditionImpl(Species.PENGUIN);

    private CageImpl cageOne = new CageImpl(1, 100.00, conditionForCageOne, true, null);
    private CageImpl cageTwo = new CageImpl(2, 200.00, conditionForCageOne, true, "dd");
    private CageImpl cageThree = new CageImpl(3, 60.00, conditionForCageOne, true, "aa");
    private CageImpl cageFour = new CageImpl(4, 80.00, conditionForCageOne, true, "vv");


    @Override
    public void checkInAnimal(Animal animal) {
        if(animal.getSpecies() == Species.LEON && cageOne.isVacantCage() &&
                animal.getName() != cageTwo.getNameAnimal() && animal.getName() != cageThree.getNameAnimal() &&
                animal.getName() != cageFour.getNameAnimal()) {
            cageOne.setVacantCage(false);
            cageOne.setNameAnimal(animal.getName());
            InhibitionLog logLeon = new InhibitionLog(new Date(), null, animal.getSpecies(), animal.getName());
            LogZoo.setLogs(logLeon);
            System.out.println("Your animal is added to the zoo!");
        }

        else if(animal.getSpecies() == Species.GIRAFFE && cageTwo.isVacantCage() &&
                animal.getName() != cageOne.getNameAnimal() && animal.getName() != cageThree.getNameAnimal() &&
                animal.getName() != cageFour.getNameAnimal()) {
            cageTwo.setVacantCage(false);
            cageTwo.setNameAnimal(animal.getName());
            InhibitionLog logGiraffe = new InhibitionLog(new Date(), null, animal.getSpecies(), animal.getName());
            LogZoo.setLogs(logGiraffe);
            System.out.println("Your animal is added to the zoo!");
        }

        else if(animal.getSpecies() == Species.SQUIRREL && cageThree.isVacantCage() &&
                animal.getName() != cageOne.getNameAnimal() && animal.getName() != cageTwo.getNameAnimal() &&
                animal.getName() != cageFour.getNameAnimal()) {
            cageThree.setVacantCage(false);
            cageThree.setNameAnimal(animal.getName());
            InhibitionLog logSquirrel = new InhibitionLog(new Date(), null, animal.getSpecies(), animal.getName());
            LogZoo.setLogs(logSquirrel);
            System.out.println("Your animal is added to the zoo!");
        }

        else if(animal.getSpecies() == Species.PENGUIN && cageFour.isVacantCage() &&
                animal.getName() != cageOne.getNameAnimal() && animal.getName() != cageTwo.getNameAnimal() &&
                animal.getName() != cageThree.getNameAnimal()) {
            cageFour.setVacantCage(false);
            cageFour.setNameAnimal(animal.getName());
            InhibitionLog logPenguin = new InhibitionLog(new Date(), null, animal.getSpecies(), animal.getName());
            LogZoo.setLogs(logPenguin);
            System.out.println("Your animal is added to the zoo!");
        }
        else {
            System.out.println("Your animal can not add to the zoo!");
        }
    }

    @Override
    public void checkOutAnimal(Animal animal) {
        if(animal.getName().equalsIgnoreCase(cageOne.getNameAnimal()) && !cageOne.isVacantCage()) {
            cageOne.setNameAnimal(null);
            cageOne.setVacantCage(true);
            InhibitionLog logLeonOut = new InhibitionLog(LogZoo.getLogs().get(0).getCheckInDate(), new Date(), LogZoo.getLogs().get(0).getAnimalSpecies(), animal.getName());
            LogZoo.setLogs(logLeonOut);
        }
        else if(animal.getName().equalsIgnoreCase(cageTwo.getNameAnimal()) && !cageTwo.isVacantCage()) {
            cageTwo.setNameAnimal(null);
            cageTwo.setVacantCage(true);
            InhibitionLog logGiraffeOut = new InhibitionLog(LogZoo.getLogs().get(0).getCheckInDate(), new Date(), LogZoo.getLogs().get(0).getAnimalSpecies(), animal.getName());
            LogZoo.setLogs(logGiraffeOut);
        }
        else if(animal.getName().equalsIgnoreCase(cageThree.getNameAnimal()) && !cageThree.isVacantCage()) {
            cageThree.setNameAnimal(null);
            cageThree.setVacantCage(true);
            InhibitionLog logSquirrelOut = new InhibitionLog(LogZoo.getLogs().get(0).getCheckInDate(), new Date(), LogZoo.getLogs().get(0).getAnimalSpecies(), animal.getName());
            LogZoo.setLogs(logSquirrelOut);
        }
        else if(animal.getName().equalsIgnoreCase(cageFour.getNameAnimal()) && !cageFour.isVacantCage()) {
            cageFour.setNameAnimal(null);
            cageFour.setVacantCage(true);
            InhibitionLog logPenguinOut = new InhibitionLog(LogZoo.getLogs().get(0).getCheckInDate(), new Date(), LogZoo.getLogs().get(0).getAnimalSpecies(), animal.getName());
            LogZoo.setLogs(logPenguinOut);
        }
        else {
            System.out.println("Your animal not found in the zoo!");
        }


    }

    @Override
    public List<InhibitionLog> getHistory() {
        return LogZoo.getLogs();
    }
}
