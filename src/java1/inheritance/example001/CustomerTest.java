package java1.inheritance.example001;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10000,"LEE");
        customerLee.bonusPoint = 1000;
//        System.out.println(customerLee.showCustomerInfo());


        VIPCustomer customerKim = new VIPCustomer(10001,"KIM",1222);
        customerKim.bonusPoint = 10000;
//        System.out.println(customerKim.showCustomerInfo());


        GoldCustomer customerHa = new GoldCustomer(10002,"HA");
        customerHa.bonusPoint = 20000;

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);
        int priceHa = customerHa.calcPrice(10000);

        System.out.println(customerLee.showCustomerInfo() + "지불금액은 "+ priceLee + "입니다 ");
        System.out.println(customerKim.showCustomerInfo() + "지불금액은 "+ priceKim + "입니다 ");
        System.out.println(customerHa.showCustomerInfo() + "지불금액은 "+ priceHa+ "입니다 ");

        VIPCustomer vc = new VIPCustomer(10002,"PArk",1221);
        vc.bonusPoint =1000;

        int pricevc = vc.calcPrice(10000);
        System.out.println(vc.showCustomerInfo() + "지불금액은 "+ pricevc + "입니다 ");

    }
}
