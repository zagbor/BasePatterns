package structural.proxy;

public class DeliverMan {
    RealMessage message;


    public DeliverMan(RealMessage message) {
        this.message = message;
    }

    public void sendMessage() {
        System.out.println("Взял сообщение и понес.");
        message.send();
        System.out.println("Доставил");
    }
}
