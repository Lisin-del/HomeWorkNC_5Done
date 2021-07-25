package zoo.model;

public class CageImpl implements Cage {
    private int number;
    private double area;
    private Condition condition;
    private boolean isVacantCage;
    private AnimalFactory animal;


    public CageImpl(int number, double area, Condition condition, boolean isVacantCage, AnimalFactory animal) {
        this.number = number;
        this.area = area;
        this.condition = condition;
        this.isVacantCage = isVacantCage;
        this.animal = animal;
    }

    public void setAnimal(AnimalFactory animal) {
        this.animal = animal;
    }

    public void setVacantCage(boolean isVacantCage) {
        this.isVacantCage = isVacantCage;
    }

    public AnimalFactory getAnimal() {
        return animal;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public Condition getCondition() {
        return condition;
    }

    @Override
    public boolean isVacantCage() {
        return isVacantCage;
    }
}
