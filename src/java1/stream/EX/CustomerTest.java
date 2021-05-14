package java1.stream.EX;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {
    public static void main(String[] args) {
        TravelCustomer K = new TravelCustomer("KIM",30,100);
        TravelCustomer L = new TravelCustomer("LEE",30,100);
        TravelCustomer S = new TravelCustomer("SONG",19,50);

        List<TravelCustomer> list = new ArrayList<>();
        list.add(K);
        list.add(L);
        list.add(S);

        System.out.println("======고객명단 추가된 순서대로 출력======");
        list.stream().map(c ->c.getCustomerName()).forEach(s -> System.out.println(s));

        int total = list.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("총 여행 비용은 :" + total + "입니다");

        System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
        list.stream().filter(c->c.getCustomerAge()>= 20).map(c->c.getCustomerName()).sorted().forEach(s-> System.out.println(s));
    }
}
