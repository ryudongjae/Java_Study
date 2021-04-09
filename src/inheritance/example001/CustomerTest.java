package inheritance.example001;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10000,"LEE");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());


        VIPCustomer customerKim = new VIPCustomer(10001,"KIM");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
