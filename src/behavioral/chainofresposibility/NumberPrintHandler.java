package behavioral.chainofresposibility;

public class NumberPrintHandler extends NumberHandler {
    public NumberPrintHandler(NumberHandler numberHandler) {
        super(numberHandler);
    }

    @Override
    void handle(String message) {
        System.out.println(message);
    }
}
