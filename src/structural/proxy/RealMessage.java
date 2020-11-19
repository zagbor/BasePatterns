package structural.proxy;

public class RealMessage implements Message {
    private String message;

    public String getMessage() {
        return message;
    }

    public RealMessage(String message) {
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Сообщение \"" + message + "\"+ доставляют");

    }
}
