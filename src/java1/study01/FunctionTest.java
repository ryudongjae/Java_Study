package java1.study01;

public class FunctionTest {
    //method
    public static int addNum(int num1,int num2){

        int result;
        result = num1 + num2;
        return result;
    }
    //method
    public static void sayHello(String greetting){
        System.out.println(greetting);
    }

    public static int calcSum(){
        int sum = 0;
        int i;

        for(i = 0; i<=100; i++){
            sum += i;
        }
        return sum;
    }
    //method
    public static void main(String[] args) {

        int n1 = 20;
        int n2 = 30;

        int total = addNum(n1,n2);

        sayHello("hihihi");
        int num = calcSum();

        System.out.println(total);
        System.out.println(num);

    }
}//스택 : 함수가 호출될 때 지역 변수들이 사용하는 메모리
/*메서드 (method)
객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
멤버 함수 (member function)이라고도 함
메서드를 구현함으로써 객체의 기능이 구현 됨
메서드의 이름은 그 객체를 사용하는 객체(클라이언트)에 맞게 짓는것이 좋음*/
