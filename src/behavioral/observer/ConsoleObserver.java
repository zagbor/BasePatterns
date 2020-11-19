package behavioral.observer;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(double USDRUB, double USDUAH) {
        System.out.println("Курс валют изменился теперь USD/RUB стоит" +
                " " + USDRUB + ", а USD/UAH стоит " + USDUAH);
    }
}
