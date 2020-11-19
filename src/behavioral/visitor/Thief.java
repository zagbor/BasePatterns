package behavioral.visitor;

public class Thief implements Visitor {
    @Override
    public void visit(Engine engine) {
        System.out.println("Завел двигатель с помощью специального устройства.");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Взломал дверь");
    }
}
