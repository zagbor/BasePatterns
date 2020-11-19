package behavioral.chainofresposibility;

public abstract class NumberHandler {
    NumberHandler numberHandler;

    public NumberHandler(NumberHandler messageHandler){
        this.numberHandler = messageHandler;
    }

    abstract void handle(String message);
}
