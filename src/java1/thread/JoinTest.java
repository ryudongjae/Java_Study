package java1.thread;

public class JoinTest extends Thread{
    int start;
    int end;
    int total;
    public JoinTest(int start, int end){
        this.start = start;
        this.end = end;
    }
    public void run(){
        int i;
        for (i =start;  i<=end; i++){
            total += i;
        }
    }

    public static void main(String[] args) {
        JoinTest j1 = new JoinTest(1,50);
        JoinTest j2 = new JoinTest(51,100);

        j1.start();
        j2.start();
       try {
           //동시에 두 개 이상의 Thread가 실행 될 때 다른 Thread의 결과를 참조 하여 실행해야 하는 경우 join() 함수를 사용
           //join() 함수를 호출한 Thread가 not-runnable 상태가 감
           //다른 Thread의 수행이 끝나면 runnable 상태로 돌아옴
          j1.join();
          j2.join();
       }catch (InterruptedException e){
           e.printStackTrace();
       }


        int lastTotal = j1.total + j2.total;

        System.out.println("j1.total: "+ j1.total);
        System.out.println("j2.total: "+ j2.total);

        System.out.println("j1.total + j2.total : "+  lastTotal);

    }
}

