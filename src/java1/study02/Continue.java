package java1.study02;

public class Continue {
    public static void main(String[] args) {
        int num;

        for (num =1; num<=100; num++){
            if ((num%3) !=0) continue;  //num이 100까지 계속된다. num이 100을 넘어가면 멈춘다.
            System.out.println(num);
        }
    }
}
