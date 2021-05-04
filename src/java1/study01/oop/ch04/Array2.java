package java1.study01.oop.ch04;

public class Array2 {
    private String title;
    private String author;

    public Array2(){}

    public Array2(String title, String author) {
        this.title = title;
        this.author = author;
    }

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
    public void showInfo(){
        System.out.println(getTitle() + ","+getAuthor());
    }

    public static void main(String[] args) {
        Array2[] book = new Array2[5];
        Array2[] copyBook = new Array2[5];
        book[0] = new Array2("1","Kim");
        book[1] = new Array2("2","Lee");
        book[2] = new Array2("3","Ryu");
        book[3] = new Array2("4","Park");
        book[4] = new Array2("5","Jo");

        book[0].setAuthor("Lim");
        book[1].setTitle("1");

        System.arraycopy(book , 0 ,copyBook,0,5);
//        for (Arrray2 arrray2 : book){
//            System.out.println(arrray2);
//            arrray2.showInfo();
//        }
        for (int i = 0; i < book.length; i++){
            System.out.println(book[i]);
            System.out.print(book[i].getTitle());
            System.out.println(book[i].getAuthor());
        }
        for(Array2 array2 : book){
            array2.showInfo();
        }
        System.out.println("===============================");
        for (int i = 0; i < copyBook.length; i++){
            System.out.println(copyBook[i]);
        }

        for (Array2 array2 : copyBook){
            array2.showInfo();
        }

    }
}
