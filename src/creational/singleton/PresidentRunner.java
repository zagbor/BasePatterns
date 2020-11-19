package creational.singleton;

public class PresidentRunner {
    public static void main(String[] args) {
     President.getPresident().addPutinTerm(3);
     President.getPresident().costPutinTerms();
    }
}
