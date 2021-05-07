package java1.study01.oop.ch04.EX4.abstract01.EX;

public class ManualCar extends Car{
    @Override
    void drive() {
        System.out.println("주행을 시작합니다.");
    }

    @Override
    void stop() {
        System.out.println("브레이크를 밟아서 멈춥니다.");
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
