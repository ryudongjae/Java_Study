package java1.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length >= s2.getBytes().length){
            return s1;
        }else {
            return s2;
        }
    }
}

//reduce 연산은 정의된 연산을 구현하는 것이 아닌 직접 구현한 연산을 사용
public class ReduceTest {
    public static void main(String[] args) {
        String [] arr = {"hi", "hello","goodDay","Bye"};

        System.out.println(Arrays.stream(arr).reduce("",(s1, s2) ->{ if(s1.getBytes().length >= s2.getBytes().length){
            return s1;
        }else {
            return s2;
        }}));
        String str = Arrays.stream(arr).reduce(new CompareString()).get(); //binaryOperator를 구현한 클래스 이용
        System.out.println(str);
    }
}
