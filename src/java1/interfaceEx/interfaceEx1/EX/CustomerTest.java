package java1.interfaceEx.interfaceEx1.EX;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();



        Buy buy = new Customer();
        buy.buy();
        buy.order();


        Sell sell = new Customer();
        sell.order();
        sell.sell();
    }
}
