package study01;

import java.util.ArrayList;

public class ElseIf02 {
    public static void main(String[] args) {
        boolean hasCard = false;
        ArrayList<String>pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handPhone");

        if (pocket.contains("money")) {
            System.out.println("택시타고 가라");
        }else if (hasCard){
            System.out.println("택시타고 가라");
        }else {
            System.out.println("걸어가라");
       }
    }
}
