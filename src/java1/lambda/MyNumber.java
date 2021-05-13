package java1.lambda;

@FunctionalInterface
public interface MyNumber {
    int getMax(int num1,int num2);
}

class MyNumberTest{
    public static void main(String[] args) {

        MyNumber myNumber = (x,y) -> x > y ? x:y;

        System.out.println(myNumber.getMax(10,20));
    }
}
