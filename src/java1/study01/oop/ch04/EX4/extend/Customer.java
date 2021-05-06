package java1.study01.oop.ch04.EX4.extend;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;
//새로운 클래스를 정의 할 때 이미 구현된 클래스를 상속(inheritance) 받아서 속성이나 기능을 확장하여 클래스를 구현함\
//상위 클래스는 하위 클래스 보다 더 일반적인 개념과 기능을 가짐
// 하위 클래스는 상위 클래스 보다 더 구체적인 개념과 기능을 가짐
//하위 클래스가 상위 클래스의 속성과 기능을 확장 (extends)한다는 의미


    /**public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;

		System.out.println("Customer() 생성자 호출");
	}*/


    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;
        //System.out.println("Customer(int, String) 생성자 호출");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }


    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade +
                "이며, 보너스 포인트는 " + bonusPoint + "입니다";

    }
}
