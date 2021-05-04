package java1.study01.oop.ch04.EX4.aaa;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private int customerId;
    private int money;

    ArrayList<Menu> orderList;


    public Customer(String customerName, int customerId, int money) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.money = money;

        orderList = new ArrayList<Menu>();
    }


    public void addMenu(String menuName,int menuPrice){
        Menu menu = new Menu();
        menu.setMenuName(menuName);
        menu.setPrice(menuPrice);
        orderList.add(menu);

    }

    public void showMoney(){
        int total = 0;

        for(Menu m : orderList){
            total += m.getPrice();
            System.out.println(m.getMenuName()+"의 가격은"+ m.getPrice()+"원입니다.");
        }

        if (total > money){
            System.out.println("잔액 부족 ");
        }else {
            money = money-total;
        }
        System.out.println("총"+total+"입니다."+customerName+" 님의 현재 잔액은 "+money+"입니다 .");
    }
}
