package java1.study01.oop.ch04.EX4.abstract01;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer1 = new Desktop();
        Computer computer2 = new Notebook();

        computer2.display();
        computer2.trunOn();
        computer2.typing();
        computer2.turnOff();

        computer1.display();
        computer1.trunOn();
        computer1.typing();
        computer1.turnOff();
    }
}
