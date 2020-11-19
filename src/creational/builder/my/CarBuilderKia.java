package creational.builder.my;

public class CarBuilderKia extends CarBuilder {

    @Override
    void buildCountry() {
        car.setCountry("Korea");
    }

    @Override
    void buildModel() {
        car.setModel(Model.KIA);
    }

    @Override
    void buildPrice() {
        car.setPrice(3000);
    }
}
