package java1.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("K");
        list.add("T");
        list.add("R");

        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(s+ " "));
        System.out.println();


        list.stream().sorted().forEach(s -> System.out.println(s+ " "));
        list.stream().map(s -> s.length()).forEach(n -> System.out.println(n)); //forEach 요소를 하나씩 꺼내옴 map은 중간연산이고 forEach는 최종연산
        list.stream().filter(s -> s.length() >= 1).forEach(s -> System.out.println(s));
     }
}
