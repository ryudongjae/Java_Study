package java1.study01.oop.ch04.EX2.collaboration.EX;

public class Person {
    public String name;
    public int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi){
        taxi.take(10000);
        this.money -= 10000;

    }

    public void showT(){
        System.out.println(name +"님의 남은 돈은 " +money +"원 입니다. ");
    }

    public static void main(String[] args) {
        Person pp = new Person("Edward",20000);


        Taxi t = new Taxi("잘 간다 운수");


        pp.takeTaxi(t);
        pp.showT();
        t.showTaxi();
    }

}
