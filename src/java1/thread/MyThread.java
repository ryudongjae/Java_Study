package java1.thread;

public class MyThread extends Thread{

    public void run(){
        int i;
        for (i = 0; i < 200; i++){
            System.out.print(i + "\t");
        }
    }


}
class ThreadTest{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        MyThread th = new MyThread();
        th.start();

        MyThread th2 = new MyThread();
        th2.start();

    }

}