package abstractEx.Car;

public class AIcar extends Car{
    @Override
    void drive() {
        System.out.println("자율주행 합니다.");
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    @Override
    void stop() {
        System.out.println("스스로 멈춥니다. ");
    }
}
