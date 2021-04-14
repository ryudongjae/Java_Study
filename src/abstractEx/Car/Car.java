package abstractEx.Car;

public abstract class Car{
    abstract void drive();
    abstract void stop();


    public void startCar(){
        System.out.println("시동을 켭니다. ");

    }

    public void turnOff(){
        System.out.println("시동을 끕니다. ");

    }
    final public void run(){
        drive();
        stop();
        startCar();
        turnOff();
    }
}
