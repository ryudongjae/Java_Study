package java1.thread.synchronization;

//두 개의 thread 가 같은 객체에 접근 할 경우, 동시에 접근 함으로써 오류가 발생
//동기화는 임계영역에 접근한 경우 공유자원을 lock 하여 다른 thread의 접근을 제어
//동기화를 잘못 구현하면 deadlock에 빠질 수 있다.
class Bank{

    private int money = 10000;

    public synchronized void saveMoney(int plusMoney){
        int m = this.getMoney();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m + plusMoney);
    }

    public  synchronized void minusMoney(int minusMoney){
        int m = this.money;

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m - minusMoney);
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
class Park extends Thread{
    public void run(){
        System.out.println("saveMoney Start");
        SyncMain.myBank.saveMoney(3000);
        System.out.println("saveMoney(3000) :"+ SyncMain.myBank.getMoney());
    }
}

class ParkWife extends Thread{
    public void run(){
        System.out.println("Start Minus");
        SyncMain.myBank.minusMoney(1000);
        System.out.println("Minus Money(1000) : "+SyncMain.myBank.getMoney());
    }

}

public class SyncMain {

    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException {

        Park p = new Park();
        p.start();

        Thread.sleep(200);

        ParkWife pw = new ParkWife();

        pw.start();

    }
}
