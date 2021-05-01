package java1.study01.oop.ch02;

public class function {

    public static int add(int num1,int num2){
        int result;
        result = num1 + num2;
        return result;
    }
    public static void sayHello(String greeting){
        System.out.println(greeting);
    }
    public static int calc()
    {
        int sum = 0;
        int i;
        for(i =0; i <=100; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int total =  add(n1,n2);
        System.out.println(total);

        sayHello("Hi");

        total = calc();
        System.out.println(total);
    }

}
