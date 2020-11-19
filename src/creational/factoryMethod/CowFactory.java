package creational.factoryMethod;

public class CowFactory implements AnimalFactory {

    @Override
    public Cow createAnimal() {
        return new Cow();
    }
}
