package behavioral.visitor;

public class Runner {
    public static void main(String[] args) {
        Visitor owner = new Owner();
        Body body = new Body();
        Thief thief = new Thief();
        Engine engine = new Engine();
        body.accept(owner);
        engine.accept(owner);
        body.accept(thief);
        engine.accept(thief);

    }
}
