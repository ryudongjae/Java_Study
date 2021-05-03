package java1.study01.oop.ch04.EX2;

public class Encapsulation {
//캡슐화
// 꼭 필요한 정보와 기능만 외부에 오픈함
//대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만은 제공하여 일관된 기능을 구현 하게 함\
//각각의 메서드나 멤버 변수를 접근함으로써 발생하는 오류를 최소화한다.

    StringBuffer buffer = new StringBuffer();

    private String line = "==============================\n";
    private String title = "이름\t주소\t\t  전화번호 \n";

    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody(){
        buffer.append("KK \t");
        buffer.append("Seoul \t" );
        buffer.append("010-1111-2222 \n");

        buffer.append("LL \t");
        buffer.append("Seoul \t" );
        buffer.append("010-1141-2223 \n");
    }

    private void makeFooter(){
        buffer.append(line);
    }

    public String show(){
        makeHeader();
        generateBody();
        makeFooter();

        return buffer.toString();
    }

    public static void main(String[] args) {
        Encapsulation ee = new Encapsulation();
        String report = ee.show();
        System.out.println(report);
    }
}
