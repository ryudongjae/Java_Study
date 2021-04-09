package inheritance.example001;

public class VIPCustomer extends Customer{
        private int agentID;
        double salesRatio;

        public VIPCustomer(int customerID,String customerName){
            //super은 상위클래스의 기본 생성자를 호출함
            super(customerID,customerName);

            customerGrade = "VIP";
            bonusRatio = 0.05;
            salesRatio = 0.1;
        }

        public int getAgentID(){
            return agentID;
        }

}
