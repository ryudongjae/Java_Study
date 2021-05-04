package java1.study01.oop.ch04.EX3;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car sonata = factory.createCar();
        Car k5 = factory.createCar();


        System.out.println(sonata.getCarNum());
        System.out.println(k5.getCarNum());
    }
}
