package java1.study01.oop.ch03;

public class Example2 {
    public String orderNumber;
    public String orderPhoneNumber;
    public String orderAddress;
    public String orderDate;
    public String orderTime;
    public int price;
    public String menuNumber;

    public Example2(String orderNumber, String orderPhoneNumber, String orderAddress, String orderDate, String orderTime, int price, String menuNumber) {
        this.orderNumber = orderNumber;
        this.orderPhoneNumber = orderPhoneNumber;
        this.orderAddress = orderAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.price = price;
        this.menuNumber = menuNumber;
    }

    public void showOrder(){
        System.out.println("주문 접수 번호 : "+orderNumber+
                "\n주문 핸드폰 번호 : "+orderPhoneNumber+
                "\n주문 집 주소 : "+orderAddress +
                "\n주문 날짜 : "+ orderDate+
                "\n주문 시간 : "+orderTime+
                "\n주문 가격 : "+price+
                "\n메뉴 번호 : "+menuNumber);
    }

    public static void main(String[] args) {
        Example2 od =new Example2("202011020003","010-2345-0001",
                "서울시 강남구 역삼동 111-333","2020-11-02","130258",35000,"0003");
        od.showOrder();
    }
}
