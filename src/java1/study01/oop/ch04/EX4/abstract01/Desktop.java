package java1.study01.oop.ch04.EX4.abstract01;

public class Desktop extends Computer{
    @Override
    void display() {
        System.out.println("desktop display");
    }

    @Override
    void typing() {
        System.out.println("desktop typing");
    }

    @Override
    void trunOn() {
        System.out.println(" Desktop turnOn");
    }

    @Override
    void turnOff() {
        System.out.println("Desktop turnOff");
    }
}
