package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class WarRunner {
    public static void main(String[] args) {
        SoldierFactory soldierFactory = new SoldierFactory();
        List<Soldier> soldiers = new ArrayList<>();

        soldiers.add(soldierFactory.getSoldierByRank("ordinary"));
        soldiers.add(soldierFactory.getSoldierByRank("officer"));
        soldiers.add(soldierFactory.getSoldierByRank("ordinary"));
        soldiers.add(soldierFactory.getSoldierByRank("officer"));
        soldiers.add(soldierFactory.getSoldierByRank("ordinary"));
        soldiers.add(soldierFactory.getSoldierByRank("officer"));
        soldiers.add(soldierFactory.getSoldierByRank("ordinary"));
        soldiers.add(soldierFactory.getSoldierByRank("officer"));
        soldiers.add(soldierFactory.getSoldierByRank("ordinary"));
        soldiers.add(soldierFactory.getSoldierByRank("officer"));
        soldiers.add(soldierFactory.getSoldierByRank("ordinary"));
        soldiers.add(soldierFactory.getSoldierByRank("officer"));

        soldiers.stream().forEach(soldier -> {
            soldier.fire();
            soldier.runBack();
            soldier.runForward();
        });
    }
}
