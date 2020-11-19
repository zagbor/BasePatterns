package structural.proxy;

public class ProxyMessage implements Message {
    private DeliverMan deliverMan;
    private RealMessage realMessage;
    private String message;

    public ProxyMessage(String message) {
        this.message = message;
    }

    @Override
    public void send() {
        if (realMessage == null) {
            realMessage = new RealMessage(message);
            deliverMan = new DeliverMan(realMessage);
        }
        deliverMan.sendMessage();
    }


}
