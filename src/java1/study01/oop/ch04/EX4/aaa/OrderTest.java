package java1.study01.oop.ch04.EX4.aaa;

public class OrderTest {
    public static void main(String[] args) {
        Customer c = new Customer("KK",1,30000);
        c.addMenu("라면" , 2000);
        c.addMenu("만두" , 4000);

        c.showMoney();
    }



}
