package behavioral.chainofresposibility;

public class NumberHandlerPlus extends NumberHandler {

    public NumberHandlerPlus(NumberHandler numberHandler) {
        super(numberHandler);
    }

    @Override
    void handle(String message) {
        message = "7" + message;
        numberHandler.handle(message);
    }

}

