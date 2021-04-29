package java1.inheritance.example001;

public class GoldCustomer extends Customer{
    double salesRatio;

    public GoldCustomer(int customerID, String customerName) {
        //super은 상위클래스의 기본 생성자를 호출함
        super(customerID, customerName);

        customerGrade ="GOLD";
        bonusRatio = 0.05;
        salesRatio = 0.05;
    }

    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price -(int)(price*salesRatio);
    }
}
