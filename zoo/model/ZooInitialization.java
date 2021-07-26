package zoo.model;

import java.util.ArrayList;
import java.util.List;

public class ZooInitialization {
    //conditions
    private Condition conditionForCageOne = new ConditionImpl(Species.LEON);
    private Condition conditionForCageTwo = new ConditionImpl(Species.GIRAFFE);
    private Condition conditionForCageThree = new ConditionImpl(Species.SQUIRREL);
    private Condition conditionForCageFour = new ConditionImpl(Species.PENGUIN);

    //cages
    private CageImpl cageOne = new CageImpl(1, 100.00, conditionForCageOne, true, null);
    private CageImpl cageTwo = new CageImpl(2, 200.00, conditionForCageTwo, true, null);
    private CageImpl cageThree = new CageImpl(3, 60.00, conditionForCageThree, true, null);
    private CageImpl cageFour = new CageImpl(4, 80.00, conditionForCageFour, true, null);

    //list cages
    private List<CageImpl> cages = new ArrayList<>();

    //constructor
    public ZooInitialization() {
        cages.add(cageOne);
        cages.add(cageTwo);
        cages.add(cageThree);
        cages.add(cageFour);
    }

    public List<CageImpl> getCage() {
        return cages;
    }






}
