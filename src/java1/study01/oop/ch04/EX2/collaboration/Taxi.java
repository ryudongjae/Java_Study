package java1.study01.oop.ch04.EX2.collaboration;

public class Taxi {
    public int money;
    public int taxiNumber;
    public int  passengerCount;

    public Taxi(int taxiNumber){
        this.taxiNumber = taxiNumber;
    }

    public void take(int money) {
        this.money = money;
        passengerCount++;
    }
    public void showTaxi(){
        System.out.println("택시 "+taxiNumber+"번의 승객수는 " + passengerCount +"명 이고, 수입은 "+money+"입니다. ");
    }

}
