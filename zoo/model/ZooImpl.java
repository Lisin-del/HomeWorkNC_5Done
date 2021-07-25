package zoo.model;

import zoo.InhibitionLog;
import zoo.Zoo;

import java.util.Date;
import java.util.List;

public class ZooImpl implements Zoo {



    @Override
    public void checkInAnimal(Animal animal) {

    }

    @Override
    public void checkOutAnimal(Animal animal) {



    }

    @Override
    public List<InhibitionLog> getHistory() {
        return LogZoo.getLogs();
    }
}
