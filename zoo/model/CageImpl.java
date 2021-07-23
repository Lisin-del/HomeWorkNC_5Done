package zoo.model;

public class CageImpl implements Cage {
    private int number;
    private double area;
    private Condition condition;
    private boolean isVacantCage;
    private String nameAnimal;

    public CageImpl(int number, double area, Condition condition, boolean isVacantCage, String nameAnimal) {
        this.number = number;
        this.area = area;
        this.condition = condition;
        this.isVacantCage = isVacantCage;
        this.nameAnimal = nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public void setVacantCage(boolean isVacantCage) {
        this.isVacantCage = isVacantCage;
    }

    public String getNameAnimal() {
        return nameAnimal;
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
