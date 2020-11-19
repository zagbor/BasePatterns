package structural.flyweight;

public class Ordinary implements Soldier {
    private final String militaryRank = "Ordinary";

    public Ordinary() {
    }

    @Override
    public void fire() {
        System.out.println(militaryRank + " open fire");
    }

    @Override
    public void runForward() {
        System.out.println(militaryRank + " run forward");

    }

    @Override
    public void runBack() {
        System.out.println(militaryRank + " run back");
    }


}
