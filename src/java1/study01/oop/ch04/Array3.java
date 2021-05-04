package java1.study01.oop.ch04;

public class Array3 {
    public static void main(String[] args){
        int[][] p = {{1,2,3},{4,5,6}};

        int i,j;

        for(i = 0; i<p.length; i++){ //행
            for (j= 0; j< p[i].length; j++){ // 열
                System.out.print(p[i][j]+",");
            }
            System.out.println("\t"+ p[i].length);
        }
    }
}
