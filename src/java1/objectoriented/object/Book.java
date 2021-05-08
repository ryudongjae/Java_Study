package java1.objectoriented.object;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {  //객체의 정보를 String으로 바꾸어서 사용할 때 쓰임
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book book = new Book("1","KIM");
        System.out.println(book.toString());
        System.out.println(book);
    }
}
