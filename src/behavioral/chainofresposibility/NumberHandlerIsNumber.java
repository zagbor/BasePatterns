package behavioral.chainofresposibility;

public class NumberHandlerIsNumber extends NumberHandler {
    public NumberHandlerIsNumber(NumberHandler numberHandler) {
        super(numberHandler);
    }

    @Override
    void handle(String message) {
        if (!message.matches("[0-9]")){
            numberHandler.handle(message);
        }

    }
}
