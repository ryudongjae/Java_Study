package java1.study01.oop.ch04.EX4.abstract01.EX;

public class AiCar extends Car{
    @Override
    void drive() {
        System.out.println("자율주행을 합니다. ");

    }

    @Override
    void stop() {
        System.out.println("장애물 앞에서 자동으로 멈춥니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("시동을 켭니다. ");
        System.out.println("자율주행을 시작합니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("자율주행을 마칩니다. ");
        System.out.println("시동을 끕니다.");
    }
}
