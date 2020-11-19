package creational.builder.my;

public abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildCountry();
    abstract void buildModel();
    abstract void buildPrice();

    Car getCar(){
        return car;
    }
}
