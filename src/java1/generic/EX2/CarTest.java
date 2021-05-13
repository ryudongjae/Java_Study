package java1.generic.EX2;

public class CarTest {
    public static void main(String[] args) {
        RunCar <Hyundai> hyundaiRunCar = new RunCar<>();
        hyundaiRunCar.setCar(new Hyundai());
        Hyundai hyundai = hyundaiRunCar.getCar();
        hyundai.run();
        hyundai.stop();


        RunCar<Tesla> teslaRunCar = new RunCar<>();
        teslaRunCar.setCar(new Tesla());
        Tesla tesla = teslaRunCar.getCar();
        tesla.run();
        tesla.stop();
    }


}
