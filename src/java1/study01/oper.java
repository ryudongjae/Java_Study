package java1.study01;

public class oper {
    public static void main(String[] args) {

        int num = 10;
        int num1 = 10;

        boolean value =(num > num1);
        System.out.println(value);
        System.out.println(num == num1);

        boolean value2 = ((num += 10)<10) && ((num1 +=10)<10);
        boolean value3 = ((num += 10 )<10)||((num1 += 10)>10);

        System.out.println(value2);
        System.out.println(value3);


    }


}
