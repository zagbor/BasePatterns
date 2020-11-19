package creational.builder.my;

public class CarBuilderFord extends CarBuilder {


    @Override
    void buildCountry() {
        car.setCountry("USA");
    }

    @Override
    void buildModel() {
        car.setModel(Model.FORD);
    }

    @Override
    void buildPrice() {
        car.setPrice(4000);
    }

}
