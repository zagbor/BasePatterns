package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SoldierFactory {

    private static final Map<String, Soldier> soldiers = new HashMap<>();

    public Soldier getSoldierByRank(String rank) {
        Soldier soldier = soldiers.get(rank);
        if (soldier == null) {
            switch (rank) {
                case "ordinary":
                    System.out.println("Create ordinary soldier");
                    soldier = new Ordinary();
                    break;
                case "officer":
                    System.out.println("Create officer soldier");
                    soldier = soldiers.get(rank);
                    soldier = new Officer();

            }
            soldiers.put(rank, soldier);
        }
        return soldier;
    }
}
