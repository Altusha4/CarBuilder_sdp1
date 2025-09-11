public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Director director = new Director(builder);

        Car car1 = director.buildToyotaCamry();
        Car car2 = director.buildToyotaLC();
        System.out.println(car1);
        System.out.println(car2);
    }
}