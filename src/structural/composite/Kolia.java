package structural.composite;

public class Kolia implements Soldier {
    String name = "Kolia";

    @Override
    public void fire() {
        System.out.println(name + " open fire.");
    }

    @Override
    public void runForward() {
        System.out.println(name + " run forward.");
    }

    @Override
    public void runBack() {
        System.out.println(name + "run back.");

    }

    @Override
    public void die() {
        System.out.println(name + " die.");
    }
}
