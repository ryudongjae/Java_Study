package java1.example.example3;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car Sonata1 = factory.createCar();
        Car Sonata2 = factory.createCar();
        Car Kona1 = factory.createCar();

        System.out.println(Sonata1.getCar());
        System.out.println(Sonata2.getCar());
        System.out.println(Kona1.getCar());
    }
}
