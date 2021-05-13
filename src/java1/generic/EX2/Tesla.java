package java1.generic.EX2;

public class Tesla extends Car{
    @Override
    public void run() {
        System.out.println("자율주행 입니다.");
    }

    @Override
    public void stop() {
        System.out.println("장애물을 인식하면 자동으로 멈춥니다.");
    }
}
