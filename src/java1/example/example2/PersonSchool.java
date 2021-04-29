package java1.example.example2;

public class PersonSchool {

    public static void main(String[] args) {
        Person person1 = new Person("Edward",20000);
        Taxi taxi = new Taxi("Seoul");
        person1.takeTaxi(taxi);

        person1.showInfo();
        taxi.showTinfo();

    }
}
