package behavioral.mediator;

public class RealColleague implements Colleague {
    boolean status;
    String name;

    public RealColleague(Mediator mediator, String name) {
        this.name = name;
        this.mediator = mediator;
    }

    Mediator mediator;

    @Override
    public void setFalse() {
        status = false;
        System.out.println(name + " status is false");
    }

    @Override
    public void setTrue() {
        status = true;
        System.out.println(name + " status is true");
    }

    @Override
    public void changeStatus() {
        mediator.requestAll(this);
    }
}
