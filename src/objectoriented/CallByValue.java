package objectoriented;

import org.w3c.dom.css.Counter;

class Updater{
    public void update(CallByValue callByValue){
        callByValue.count++;
    }
}

public class CallByValue {
    int count = 0; //객체 변수
    public static void main(String[] args) {
        CallByValue myCounter = new CallByValue();
        System.out.println("before update:" +myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);   //update 메소드 호출하는 부분
        System.out.println("after update:" +myCounter.count); //myCounter 객체의 count 값이 1만큼 증가되었다.

    }
}
