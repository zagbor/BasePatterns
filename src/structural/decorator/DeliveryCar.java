package structural.decorator;

public class DeliveryCar extends DeliveryDecorator {
    public DeliveryCar(Delivering delivering) {
        super(delivering);
    }

    void getCar() {
        System.out.println("Получил машину.");
    }

    @Override
    public void deliver() {
        super.deliver();
        getCar();


    }
}
