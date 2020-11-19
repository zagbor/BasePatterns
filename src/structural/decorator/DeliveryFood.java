package structural.decorator;

public class DeliveryFood {

    public static void main(String[] args) {
        Delivering delivering = new DeliveryKick(new DeliveryCar(new DeliveryMan()));
        delivering.deliver();
    }
}
