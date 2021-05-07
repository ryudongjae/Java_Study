package java1.study01.oop.ch04.EX4.abstract01.EX;

public abstract class Car {
    abstract void drive();

    abstract void stop();

    public void turnOn(){
        System.out.println("시동을 켭니다.");

    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }
    public final void run(){
        turnOn();
        drive();
        stop();
        turnOff();
    }
}
