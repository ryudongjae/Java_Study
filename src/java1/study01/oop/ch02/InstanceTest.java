package java1.study01.oop.ch02;

public class InstanceTest {
    public static void main(String[] args) {
        Student studentK  = new Student();
        studentK.name = "KIM";
        studentK.address ="SEOUL";
        studentK.age = 23;
        studentK.phoneNumber = "010-0000-1111";

        studentK.showInfo();

        Student studentJ  = new Student();
        studentJ.name = "JUN";
        studentJ.address ="BUSAN";
        studentJ.age = 24;
        studentJ.phoneNumber = "010-1111-2222"; // jun에 대한 정보는 힙메모리에 저장된다. 그리고 자바에서 일정기간 사용하지 않으면 삭제한다.

        studentJ.showInfo();
    }
}
