package java1.study02;

public class NestedLoop {
    public static void main(String[] args) {
        int dan = 1;
        int count = 1;

//        for (; dan<= 9; dan++){   중첩 반복문
//            for (count=1; count <= 9; count++){
//                System.out.println(dan +" X " +count +" = " +dan*count);
//            }
//            System.out.println();
//        }
        dan = 1;
        count = 2;
        while(dan <= 9){
            count = 1; //초기화
            while(count <= 9){
                System.out.println(dan +" X " +count +" = " +dan*count);
                count++;
            }
            dan++;
            System.out.println();
        }
    }
}
