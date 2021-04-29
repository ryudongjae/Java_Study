package java1.study01;

import java.util.Scanner;

public class Oper1 {
    public static void main(String[] args){
        int value;
        System.out.println("압력 받은 수 중에서 큰값을 출력 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 1 :");
        int num1 = scanner.nextInt();
        System.out.println("입력 2 :");
        int num2 = scanner.nextInt();

        value =(num1 > num2)? num1:num2;
        System.out.println(value);
    }
}
