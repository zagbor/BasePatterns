package creational.factoryMethod;

public class Ferma {
    public static void main(String[] args) {
        AnimalFactory animalFactory = createAnimalBySound("хрю");
        Animal animal = animalFactory.createAnimal();
    }

    static AnimalFactory createAnimalBySound(String sound) {
        if (sound.equalsIgnoreCase("хрю")) {
            return new PigFactory();
        } else if (sound.equalsIgnoreCase("му")) {
            return new CowFactory();
        } else {
            throw new RuntimeException(sound + "is unknown sound");
        }
    }
}
