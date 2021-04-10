package inheritance.example001;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10000,"LEE");
        customerLee.bonusPoint = 1000;
//        System.out.println(customerLee.showCustomerInfo());


        VIPCustomer customerKim = new VIPCustomer(10001,"KIM");
        customerKim.bonusPoint = 10000;
//        System.out.println(customerKim.showCustomerInfo());

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);

        System.out.println(customerLee.showCustomerInfo() + "지불금액은 "+ priceLee + "입니다 ");
        System.out.println(customerKim.showCustomerInfo() + "지불금액은 "+ priceKim + "입니다 ");


        VIPCustomer vc = new VIPCustomer(10002,"Ha");
        vc.bonusPoint =1000;

        int pricevc = vc.calcPrice(10000);
        System.out.println(vc.showCustomerInfo() + "지불금액은 "+ pricevc + "입니다 ");

    }
}
