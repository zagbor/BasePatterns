package creational.builder.my;

public class Car {


    private String Country;
    private Model model;
    private int price;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Country='" + Country + '\'' +
                ", model=" + model +
                ", price=" + price +
                '}';
    }
}
