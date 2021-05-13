package java1.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListStream2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(n -> System.out.println(n + "\t"));
        System.out.println();

        int sum = Arrays.stream(arr).sum();
        System.out.println("sum : " + sum);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sum2 = list.stream().mapToInt(n ->n.intValue()).sum();  //mapToInt 는 스트림을 IntStream 으로 변환해주는 메서드다.
        System.out.println(sum2);



    }
}
