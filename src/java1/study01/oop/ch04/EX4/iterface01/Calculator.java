package java1.study01.oop.ch04.EX4.iterface01;

public class Calculator implements Calc{
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int times(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0)
            return ERROR;
        return num1/num2;
    }

    public void show(){
        System.out.println("finish!!");
    }
}
