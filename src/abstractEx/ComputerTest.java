package abstractEx;

public class ComputerTest {
    public static void main(String[] args){
        Computer computer = new DeskTop();
        computer.display();
        computer.typing();
        computer.turnOff();

        Computer computer1 = new MyNoteBook();


    }
}
