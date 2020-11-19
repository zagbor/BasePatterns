package behavioral.visitor;

public class Owner implements Visitor {
    @Override
    public void visit(Engine engine) {
        System.out.println("Запустил двигатель");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Открыл машину ключом");
    }
}
