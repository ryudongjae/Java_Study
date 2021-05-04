package java1.study01.oop.ch04.EX3;

public class Car {
    private static int SerialNum = 10000;

    public int getSerialNum() {

        return SerialNum;
    }

    private int carNum;

    public Car(){
        SerialNum++;
        carNum = SerialNum;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }






}
