package java1.study01.oop.ch04.EX4.abstract01;

public abstract class Computer {

    abstract void display();
    abstract void typing();

    void trunOn(){
        System.out.println("turn on");
    }

    void turnOff(){
        System.out.println("turn off");
    }
}
