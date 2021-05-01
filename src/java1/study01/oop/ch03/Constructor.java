package java1.study01.oop.ch03;

//생성자를 선언해주지 않으면 자바에서 기본생성자(default constructor) 가 만들어 진다
//생성자 기본 문법<class_name>([<argument_list]){[<statements]}
//객체를 생성할 때 new 키워드와 함께 사용   - new Student();
// 생성자는 일반 함수처럼 기능을 호출하는 것이 아니고 객체를 생성하기 위해 new 와 함께 호출 됨
//객체가 생성될 때 변수나 상수를 초기화 하거나 다른 초기화 기능을 수행하는 메서드를 호출 함
//생성자는 반환 값이 없고, 클래스의 이름과 동일
//대부분의 생성자는 외부에서 접근 가능하지만, 필요에 의해 private 으로 선언되는 경우도 있음

//멤버 변수는     자동 초기화
//멤버변수는 선언위치가 클래스 영역 , 지역 변수는 메소드나 생성자 내부
public class Constructor {

    private String name;
    private int age;
    private String address;

    public Constructor(String name,int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void showInfo(){
        System.out.println("이름 : "+name+"  나이 : "+age+  "  주소 : "+ address );
    }

    public static void main(String[] args) {
        Constructor kk = new Constructor("KK",30,"LA");
        kk.showInfo();
    }
}
