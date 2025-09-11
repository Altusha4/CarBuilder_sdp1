public class Director {
    CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    public Car buildToyotaCamry() {
        return builder
                .setBrand("Toyota")
                .setModel("Camry")
                .setYear(2020)
                .build();
    }

    public Car buildToyotaLC() {
        return builder
                .setBrand("Toyota")
                .setModel("Land Cruiser 200")
                .setYear(2019)
                .build();
    }
}

