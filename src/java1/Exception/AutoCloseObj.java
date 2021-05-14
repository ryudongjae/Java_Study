package java1.Exception;

public class AutoCloseObj implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("리소스가 close 되었습니다.");
    }
}
//리소스를 사용하는 경우 close() 하지 않아도 자동으로 해제 되도록 함
//리소스를 try() 내부에서 선언해야만 함
//close()를 명시적으로 호출하지 않아도 try{}블록에서 열린 리소스는 정상적인 경우나 예외가 발생한 경우 모두 자동으로 해제됨
//해당 리소스 클래스가 AutoCloseable 인터페이스를 구현 해야 함
//FileInputStream의 경우에는 AutoCloseable을 구현하고 있음
//자바 9 부터 리소스는 try() 외부에서 선언하고 변수만을 try(obj) 와 같이 사용할 수 있음

class AutoClassTest{
    public static void main(String[] args) {
        AutoCloseObj obj = new AutoCloseObj();
        try(obj){
            throw new Exception();
        }catch (Exception e){
            System.out.println("예외 부분입니다 .");
        }
    }
}
