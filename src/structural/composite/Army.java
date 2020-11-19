package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Army {
    List<Soldier> soldiers = new ArrayList();

    void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    void removeSoldier(Soldier soldier) {
        soldiers.remove(soldier);
    }

    void armyRunForward() {
        soldiers.stream().forEach(Soldier::runForward);
    }

    void armyRunBack() {
        soldiers.stream().forEach(Soldier::runBack);
    }

    void armyFire() {
        soldiers.stream().forEach(Soldier::fire);
    }

    void armyDie() {
        soldiers.stream().forEach(Soldier::die);
    }
}
