package java1.thread.synchronization;

import java.util.ArrayList;


//리소스가 어떤 조건에서 더 이상 유효하지 않은 경우 리소스를 기다리기 위해 Thread 가 wait() 상태가 된다.
//wait() 상태가 된 Thread은 notify() 가 호출 될 때까지 기다린다.
//유효한 자원이 생기면 notify()가 호출되고 wait() 하고 있는 Thread 중 무작위로 하나의 Thread를 재시작 하도록 한다.
//notifyAll()이 호출되는 경우 wait() 하고 있는 모든 Thread가 재시작 된다.
//이 경우 유효한 리소스만큼의 Thread만이 수행될 수 있고 자원을 갖지 못한 Thread의 경우는 다시 wait() 상태로 만든다.
//자바에서는 notifyAll() 메서드의 사용을 권장한다.
class Library{
    public ArrayList<String> shelf = new ArrayList<>();

    public Library(){
        shelf.add("해리포터 1");
        shelf.add("해리포터 2");
        shelf.add("해리포터 3");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();
        if(shelf.size() == 0) {
            System.out.println(t.getName() + " waiting Start");
            wait();
            System.out.println(t.getName() + " waiting End");
        }
        String book = shelf.remove(0);
        System.out.println(t.getName() +":" +book +" lend");
        return book;

    }

    public synchronized void returnBook(String book){
        Thread t = Thread.currentThread();

        shelf.add(book);
        //notify();//wait() 상태가 된 Thread은 notify() 가 호출 될 때까지 기다린다.
        notifyAll();
        System.out.println(t.getName() + ":"+ book + "return");
    }
}

class Student extends Thread{
    public void run(){
        try {
            String title = LibraryMain.library.lendBook();
            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
public class LibraryMain{
    public static Library library = new Library();

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
        s6.start();





    }
}
