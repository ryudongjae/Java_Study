package java1.interfaceEx.interfaceEx1.EX2;

public class BookShelf extends Shelf implements Queue{

    @Override
    public String enqueue(String title) {
        booklist.add(title);
        return title;
    }

    @Override
    public String dequeue() {
        return booklist.remove(0);
    }

    @Override
    public int getSize() {
        return getSize();
    }
}
