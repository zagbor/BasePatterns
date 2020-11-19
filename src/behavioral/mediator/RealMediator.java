package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class RealMediator implements Mediator {
    List<Colleague> colleagues = new ArrayList<>();

    void add(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void requestAll(Colleague colleague) {
        colleague.setTrue();
        colleagues.stream()
                .filter(colleague1 -> !colleague.equals(colleague1))
                .forEach(Colleague::setFalse);
    }
}
