package java1.interfaceEx.interfaceEx1.EX;

public interface Sell {
    void sell();

    default void order(){
        System.out.println("판매 주문");
    }
}
