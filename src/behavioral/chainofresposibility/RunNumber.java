package behavioral.chainofresposibility;

public class RunNumber {
    public static void main(String[] args) {
        NumberHandler numberHandler = new NumberHandlerPlus(new NumberHandlerIsNumber(new NumberPrintHandler(null)));
        numberHandler.handle("9111263256");
    }

}
