package java1.study01.oop.ch04.EX4.abstract01.EX;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new AiCar();
        car1.run();

        Car car2 = new ManualCar();
        car2.run();
    }

}
