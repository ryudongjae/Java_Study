package java1.generic.EX2;

public class RunCar<T extends Car> {

    private T car;

    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        this.car = car;
    }

    public void go(){
        car.run();
    }

    public void stop(){
        car.stop();
    }
}
