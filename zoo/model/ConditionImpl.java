package zoo.model;

import java.util.ArrayList;
import java.util.List;

public class ConditionImpl implements Condition {
    private List<Species> isAvailableFor = new ArrayList<>();


    public ConditionImpl(Species species) {
        isAvailableFor.add(species);
    }

    @Override
    public List<Species> isAvailableFor() {
        return isAvailableFor;
    }
}
