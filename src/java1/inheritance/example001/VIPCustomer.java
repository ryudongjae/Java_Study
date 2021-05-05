package java1.inheritance.example001;

public class VIPCustomer extends Customer{
        private int agentID;
        double salesRatio;

        public VIPCustomer(int customerID,String customerName,int agentID){
            //super은 상위클래스의 기본 생성자를 호출함

            super(customerID,customerName);

            customerGrade = "VIP";
            bonusRatio = 0.05;
            salesRatio = 0.1;
        }
        @Override
        public int calcPrice(int price){
            bonusPoint += price*bonusRatio;
            return price -(int)(price* salesRatio);
        }

        public int getAgentID(){

            return agentID;
        }

}
