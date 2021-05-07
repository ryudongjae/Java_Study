package java1.interfaceEx.interfaceEx1.EX;

public interface Buy {

    void buy();

    default void order(){
        System.out.println("구매 주문");
    }

}
