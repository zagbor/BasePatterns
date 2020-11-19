package structural.decorator;

public class DeliveryMan implements Delivering{
    @Override
    public void deliver() {
        System.out.println("Пошел доставлять посылку.");
    }
}
