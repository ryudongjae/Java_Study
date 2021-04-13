package inheritance.example001;

import java.util.ArrayList;

public class CustomerTest1 {
    public static void main(String[] args){
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10001,"Lee");
        Customer customerKim = new GoldCustomer(10002,"Kim");
        Customer customerHa = new VIPCustomer(10003,"Ha",0124);
        Customer customerPark = new VIPCustomer(10004,"Park",1014);
        Customer customerJung = new VIPCustomer(10005,"Jung",0417);

        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHa);
        customerList.add(customerPark);
        customerList.add(customerJung);

        System.out.println("===============고객 정보 출력===============");

        for(Customer customer:customerList){
            System.out.println(customer.showCustomerInfo());
        }
        System.out.println("========== 할인율과 보너스 포인트 계산 ===========");

        int price = 10000;
        for(Customer customer : customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() +"님의 "+cost +"원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() +"님의 현재 포인트는  "+customer.bonusPoint +"점 입니다.");
            System.out.println("==============================");

        }



    }
}
