package study01;

//Contain

import java.util.ArrayList;

public class If03 {
    public static void main(String[] args) {
        ArrayList<String>pocket = new ArrayList<String>();

        pocket.add("paper");
        pocket.add("handPhone");
        pocket.add("money");

        if(pocket.contains("money")) {
            System.out.println("택시타고 가라");
        }else{
            System.out.println("걸어가라");
        }
   }
}
