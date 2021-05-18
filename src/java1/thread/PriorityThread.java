package java1.thread;


//디폴트 우선순위 : Thread.NORMAL_PRIORITY(=5)
//우선 순위가 높은 Thread가 CPU의 배분을 받을 확률이 높다
public class PriorityThread extends Thread {
    public void run(){
        int sum =0;

        Thread  th = Thread.currentThread();
        System.out.println(th + "start");
        for(int i =0; i <=100000; i++){
            sum += i;
        }

        System.out.println(th.getPriority()+ "end");
    }


}
class Priority{
    public static void main(String[] args) {

        int i;
        for(i = Thread.MIN_PRIORITY; i<Thread.MAX_PRIORITY; i++){
            PriorityThread pt = new PriorityThread();
            pt.setPriority(i);
            pt.start();
        }
    }
}