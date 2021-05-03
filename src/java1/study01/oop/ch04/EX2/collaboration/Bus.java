package java1.study01.oop.ch04.EX2.collaboration;

public class Bus {
    public int busNumber;
    public int passengerCount;
    public int  money;

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showBus(){
        System.out.println("버스 "+busNumber+"번의 승객수는 " + passengerCount +"명 이고, 수입은 "+money+"입니다. ");
    }
}
