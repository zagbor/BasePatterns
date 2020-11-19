package structural.decorator;

public class DeliveryKick extends DeliveryDecorator {
    public DeliveryKick(Delivering delivering) {
        super(delivering);
    }




    public void kick(){
        System.out.println("Получил под зад.");
    }

    @Override
    public void deliver() {
        super.deliver();
        kick();
    }
}
