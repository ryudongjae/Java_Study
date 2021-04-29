package java1.study01;

public class Constructor {

    public Long orderNumber;
    public String phoneNumber;
    public String address;
    public String orderDate;
    public String orderTime;
    public String orderPrice;
    public String menuNumber;

    public Constructor(Long orderNumber, String phoneNumber, String address, String orderDate, String orderTime, String orderPrice, String menuNumber) {
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuNumber = menuNumber;
    }

    public void show(){
        System.out.println("주문번호:"+ orderNumber+"주문 핸드폰 번호:"+phoneNumber+"주문 주소:"+address+"주문날짜:"+orderDate+"주문시간:"+orderTime+"주문가격:"+orderPrice+"메뉴번호:"+menuNumber);
    }
}
