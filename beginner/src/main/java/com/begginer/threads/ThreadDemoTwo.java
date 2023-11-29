package com.begginer.threads;

public class ThreadDemoTwo implements Runnable{
    Thread thread;

    ThreadDemoTwo(){
        thread=new Thread(this,"nithin");
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 100; i++) {
                System.out.println("Child Thread Executing-->" + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println("Exceptioin Occured");
        }
        System.out.println("Child Thread Exited");
    }


}
class ThreadDemoUsage{
    public static void main(String[] args) {
        new ThreadDemoTwo();
        try{
            for(int i=10;i<=15;i++){
                System.out.println("Parent Threaead is getting executed-->"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Parent Exception Ocured");
        }
        System.out.println("Parent Thread exited");
    }
}
