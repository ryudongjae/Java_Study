package java1.study01;


import java.util.Scanner;

public class If04{
    public static void main(String[] args) {
        String value;

        Scanner scanner = new Scanner(System.in);
        System.out.println("가지고 있는 금액 ");
        int money = scanner.nextInt();

        if (money <3000){
            System.out.println("버스타고 가라");
        }else if(money > 3000){
            System.out.println("택시 ㄱ ㄱ");
        }else if(money <1000){
            System.out.println("걸어 다니자");
        }else{
            System.out.println("맘대로 해 ");
        }
        return ;
    }
}
