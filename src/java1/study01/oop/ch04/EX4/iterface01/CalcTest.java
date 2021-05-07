package java1.study01.oop.ch04.EX4.iterface01;

public class CalcTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(num1,num2));
        System.out.println(calculator.substract(num1,num2));
        System.out.println(calculator.times(num1,num2));
        System.out.println(calculator.divide(num1,num2));

        calculator.show();
    }
}
