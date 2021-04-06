package study02;

//this가 하는일
//인스턴스 자신의 메모리를 가리킴
//생성자에서 또 다른 생성자를 호출 할때 사용
//자신의 주소(참조값)을 반환함

public class This {
    public String name;
    public int age;

    public This(){
        this("이름없음", 1);
    }
    //클래스에 생성자가 여러개인 경우, this를 이용하여 생성자에서 다른 생성자를 호출할 수 있다.
    public This(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public This getThis(){ //메소드
        return this;
    }

    public static void main(String[] args) {
        This p = new This();//인스턴스
        p.name ="Kim";
        p.age =12;

        This p2 = p.getThis();
        System.out.println(p);
        System.out.println(p2);
    }
}
