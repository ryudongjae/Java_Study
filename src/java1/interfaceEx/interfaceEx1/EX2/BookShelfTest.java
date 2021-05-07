package java1.interfaceEx.interfaceEx1.EX2;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue queue = new BookShelf();
        System.out.println(queue.enqueue("A"));
        System.out.println(queue.enqueue("B"));
        System.out.println(queue.enqueue("C"));
        System.out.println(queue.enqueue("D"));
        System.out.println(queue.enqueue("E"));

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());



    }
}
