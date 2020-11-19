package structural.composite;

import java.util.List;

public class War {
    public static void main(String[] args) {
        Army army = new Army();
        Soldier soldier = new Kolia();
        Soldier soldier1 = new Vasia();
        army.soldiers = List.of(soldier1, soldier);
        army.armyRunForward();
        army.armyFire();
        army.armyRunBack();
        army.armyDie();
    }
}