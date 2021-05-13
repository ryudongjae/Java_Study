package java1.generic.EX2;

public class Hyundai extends Car{
    @Override
    public void run() {
        System.out.println("엑셀을 밟아서 주행합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아서 멈춤니다.");
    }
}
