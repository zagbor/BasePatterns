package structural.flyweight;

public class Officer implements Soldier {


    private final String militaryRank = "Officer";

    public Officer() {
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
