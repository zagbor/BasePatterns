package creational.builder.my;

public class BuildCarRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new CarBuilderFord());
        Car car = director.buildCar();
        System.out.println(car);
    }
}
