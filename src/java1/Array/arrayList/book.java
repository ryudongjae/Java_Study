package java1.Array.arrayList;

public class book {
    public String title;
    public String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showInfo(){
        System.out.println(title +" || "+ author );
    }
}
