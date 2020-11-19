package creational.builder.my;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
      this.builder = builder;
    }

    public Car buildCar() {
        builder.createCar();
        builder.buildCountry();
        builder.buildModel();
        builder.buildPrice();

     return builder.getCar();
    }
}
