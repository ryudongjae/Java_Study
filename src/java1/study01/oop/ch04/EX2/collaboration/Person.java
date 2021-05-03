package java1.study01.oop.ch04.EX2.collaboration;



public class Person {
    public String personName;
    public int money;

    public Person(String personName, int money) {
        this.personName = personName;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;

    }
    public void takeTaxi(Taxi taxi){
        taxi.take(2000);
        this.money -= 2000;

    }

    public void showMoney(){
        System.out.println(personName + "님의 잔액은 "+ money+ "입니다.");
    }


}
