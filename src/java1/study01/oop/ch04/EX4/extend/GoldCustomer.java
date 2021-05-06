package java1.study01.oop.ch04.EX4.extend;

public class GoldCustomer extends Customer{
    /**
     * public Customer() {
     * customerGrade = "SILVER";
     * bonusRatio = 0.01;
     * <p>
     * System.out.println("Customer() 생성자 호출");
     * }
     *
     * @param customerID
     * @param customerName
    */

    double salesRatio;
    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "SILVER";
        bonusRatio = 0.02;
        salesRatio = 0.1;
    }

    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price-(int)(price*salesRatio);
    }
}
