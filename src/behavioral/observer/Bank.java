package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Bank implements Observed {
    double USDRUB;
    double USDUAH;
    List<Observer> observers = new ArrayList<>();

    void setCourse(double USDRUB, double USDUAH) {
        this.USDUAH = USDUAH;
        this.USDRUB = USDRUB;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(
                observer -> observer.handleEvent(USDRUB, USDUAH));
    }
}
