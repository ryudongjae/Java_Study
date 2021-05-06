package java1.study01.oop.ch04.EX4.extend;

//자바의 모든 메서드는 가상 메서드(virtual method) 임
public class VipCustomer extends Customer{

    private int agentID;
    double salesRatio;

	/*public VIPCustomer() {
		customerGrade = "VIP";    //오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;

		System.out.println("VIPCustomer() 생성자 호출");
	}
	*/

    public VipCustomer(int customerID, String customerName,int agentID) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        this.agentID = agentID;

        //System.out.println("VIPCustomer(int, String) 생성자 호출");
    }



    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }



    public int getAgentID() {
        return agentID;
    }

    @Override//오버라이딩(overriding) : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음
    //showCustomerInfo() 재정의
    public String showCustomerInfo(){
        return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다";
    }


}
