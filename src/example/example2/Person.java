package example.example2;

public class Person {
    private String name;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi){
        taxi.take(10000);
        this.money -= 10000;
    }

    public void showInfo(){
        System.out.println(name+"님의 남은 돈은 "+money+"입니다. ");
    }
}
