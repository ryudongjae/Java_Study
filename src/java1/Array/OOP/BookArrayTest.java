package java1.Array.OOP;

public class BookArrayTest {
    public static void main(String[] args) {
        Book[] bookList = new Book[5];


        bookList[0] = new Book("해리포터1", "1");
        bookList[1] = new Book("해리포터2", "2");
        bookList[2] = new Book("해리포터3", "3");
        bookList[3] = new Book("해리포터4", "4");
        bookList[4] = new Book("해리포터5", "5");

        for(int i=0; i<bookList.length; i++){
            System.out.println(bookList[i]);
            bookList[i].showInfo();
        }

    }
}
