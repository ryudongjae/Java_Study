package Array;
//2차원 배열

public class TwoDimension {
    public static void main(String[] args){
        int[][] arr= {{1,2,3,},{4,5,6,7}};
        int i,j;

        for(i =0; i<arr.length; i++){
            for(j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print(", \t" + arr[i].length);
            System.out.println();
        }

    }

}
