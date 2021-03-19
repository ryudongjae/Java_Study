package study01;

//and,or,not
//x || y - x와 y 둘 중 적어도 하나가 참이면 참이다
//x && y - x와 y 모두 참이어야 참이다
//!x - x가 거짓이면 참이다
public class If02 {
    public static void main(String[] args) {
        int money = 2000;
        boolean hasCard = false;
        if (money >= 3000 || hasCard){
            System.out.println("택시를 타고가라");
        }else{
            System.out.println("걸어가라 ");
        }
    }
}
