package static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 1", "Skyactiv 1");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 2", "Skyactiv 2");
        System.out.println(Car.numberOfCars);
    }
}
