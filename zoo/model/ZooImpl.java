package zoo.model;

import zoo.InhibitionLog;
import zoo.Zoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZooImpl implements Zoo {
    private ZooInitialization zooInit;
    private List<InhibitionLog> logs = new ArrayList<>();
    public ZooImpl(ZooInitialization zooInit) {
        this.zooInit = zooInit;
    }

    @Override
    public void checkInAnimal(Animal animal) {
        int i = 0;
        int j = 0;
        for(CageImpl cage : zooInit.getCage()) {
            if(cage.getAnimal() == null || !cage.getAnimal().getName().equals(animal.getName())) {
                ++i;
            }
        }
        for(CageImpl cage : zooInit.getCage()) {
            ++j;
            if(animal.getSpecies() == cage.getCondition().isAvailableFor().get(0) && cage.isVacantCage() && i == 4) {
                cage.setAnimal(animal);
                cage.setVacantCage(false);
                InhibitionLog log = new InhibitionLog(new Date(), null, animal.getSpecies(), animal.getName());
                logs.add(log);
                System.out.println("Your animal is added to the zoo!");
                i = 0;
                j = 0;
                break;
            }
        }
        if(j == 4) {
            System.out.println("Your animal can not add to the zoo!");
            j = 0;
        }
    }

    @Override
    public void checkOutAnimal(Animal animal) {
        for(CageImpl cage : zooInit.getCage()) {
            if(cage.getAnimal() != null && cage.getAnimal().getName().equalsIgnoreCase(animal.getName()) && !cage.isVacantCage()) {
                System.out.println("Your animal is removed from the zoo!");
                Date date_in = new Date();
                for(InhibitionLog log : logs) {
                   if(log != null && log.getAnimalName().equalsIgnoreCase(animal.getName())) {
                       date_in = log.getCheckInDate();
                   }
                }
                InhibitionLog log_out = new InhibitionLog(date_in, new Date(), cage.getAnimal().getSpecies(), animal.getName());
                logs.add(log_out);
                cage.setAnimal(null);
                cage.setVacantCage(true);
            }
        }
    }

    @Override
    public List<InhibitionLog> getHistory() {
        return logs;
    }
}
