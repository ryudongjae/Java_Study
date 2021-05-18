package java1.thread;

import java.io.IOException;


//무한 반복의 경우 while(flag)의 flag 변수값을 false로 바꾸어 종료를 시킴
//Thread 종료하기 예제
public class TerminateThread extends Thread {
    private boolean flag = false;
    int i;

    public TerminateThread(String name){
        super(name);
    }

    public void run(){
        while(!flag){
             try{
                    sleep(100);
                }catch (InterruptedException e){
                     e.printStackTrace();
                 }
        }
        System.out.println(getName() + " end");
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

//    public void breakThread(TerminateThread terminateThread) throws IOException {
//        int in;
//        while(true){
//            in = System.in.read();
//            if ( in == 'A'){
//                terminateThread.setFlag(true);
//            }else if(in == 'B'){
//                terminateThread.setFlag(true);
//            }else if( in == 'C'){
//                terminateThread.setFlag(true);
//            }else if( in == 'M'){
//                terminateThread.setFlag(true);
//                terminateThread.setFlag(true);
//                terminateThread.setFlag(true);
//                break;
//            }else{
//                System.out.println("type again");
//            }
//        }



    public static void main(String[] args) throws IOException {
        TerminateThread th1 = new TerminateThread("A");
        TerminateThread th2 = new TerminateThread("B");
        TerminateThread th3 = new TerminateThread("C");


        th1.start();
        th2.start();
        th3.start();

        int in;
        while(true) {
            in = System.in.read();
            if (in == 'A') {
                th1.setFlag(true);
            } else if (in == 'B') {
                th2.setFlag(true);
            } else if (in == 'C') {
                th3.setFlag(true);
            } else if (in == 'M') {
                th1.setFlag(true);
                th2.setFlag(true);
                th3.setFlag(true);
                break;
            } else {
                System.out.println("try Again");
            }

        }
        System.out.println("Main end");
    }
    }
