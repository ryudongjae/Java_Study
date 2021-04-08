package example.example3;

public class Car {
    private static int SerialNum=10000;
    private int Car;

    public Car(){
        SerialNum++;
        Car = SerialNum;
    }

    public  int getCar() {
        return Car;
    }

    public void setCarNum(int car) {
        this.Car = car;
    }

}
