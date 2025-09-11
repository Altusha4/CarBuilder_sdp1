public class CarBuilder {
    String brand;
    String model;
    int year;

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }
    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public Car build() {
        if (brand == null || model == null) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        return new Car(brand, model, year);
    }
}
