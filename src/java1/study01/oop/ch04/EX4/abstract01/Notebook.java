package java1.study01.oop.ch04.EX4.abstract01;

public class Notebook extends Computer{
    @Override
    void display() {
        System.out.println("Notebook display");
    }

    @Override
    void typing() {
        System.out.println("Notebook typing");
    }

    @Override
    void trunOn() {
        System.out.println("Notebook turn On");
    }

    @Override
    void turnOff() {
        System.out.println("Notebook turn Off");
    }
}
