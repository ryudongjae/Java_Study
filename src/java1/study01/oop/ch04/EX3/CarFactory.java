package java1.study01.oop.ch04.EX3;

public class CarFactory {
    //싱글톤 패턴 = 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴

    //클래스 내부에 유일한 private 인스턴스 생성
    private static CarFactory instance = new CarFactory();

    private CarFactory(){}

    public static CarFactory getInstance() {
        if(instance == null){
            instance =new CarFactory();
        }

        return instance;
    }

    public Car createCar() {

        Car car = new Car();
        return car;
    }
}
