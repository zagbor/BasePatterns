package structural.decorator;

public class DeliveryDecorator implements Delivering {

    Delivering delivering;

    public DeliveryDecorator(Delivering delivering) {
        this.delivering = delivering;
    }

    @Override
    public void deliver() {
        delivering.deliver();
    }
}
