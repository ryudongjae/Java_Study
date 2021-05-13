package java1.stream;

import java.util.Arrays;

public class IntArrayStream {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        for (int num : arr){
            System.out.print(num);
        }
        System.out.println();

        Arrays.stream(arr).forEach(n -> System.out.print(n));

        System.out.println();
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
     }
}
