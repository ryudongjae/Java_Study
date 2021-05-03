package java1.study01.oop.ch04.EX2.collaboration.EX;

public class Taxi
{
    public String taxiName;
    public int money;

    public Taxi(String taxiName) {
        this.taxiName = taxiName;
    }

    public void take(int money) {
        this.money = money;
    }
    public void showTaxi(){
        System.out.println(taxiName+"의 수입은 "+money +"입니다 .");
    }
}
