package java1.thread;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        int i;
        for (i = 0; i< 200; i++){
            System.out.println(i + "\t");
        }
    }
}
class MyThreadTest2{
    public static void main(String[] args) {
        System.out.println("main start");

        MyThread2 th2 = new MyThread2();
        Thread th = new Thread(th2);
        th.start();


        MyThread2 th0 = new MyThread2();
        Thread th1 = new Thread(th0);
        th1.start();


    }

}
