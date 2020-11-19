package creational.factoryMethod;

public class PigFactory implements AnimalFactory {
    @Override
    public Pig createAnimal() {
        return new Pig();
    }
}
