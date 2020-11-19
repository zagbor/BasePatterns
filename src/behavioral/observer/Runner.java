package behavioral.observer;

public class Runner {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addObserver(new ConsoleObserver());
        bank.addObserver(new ConsoleObserver());
        bank.setCourse(35.4, 69.7);
    }
}
