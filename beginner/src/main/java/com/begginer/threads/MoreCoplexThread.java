package com.begginer.threads;

public class MoreCoplexThread implements Runnable {

    Thread thread;
    String name;

     MoreCoplexThread(String threadName) {
        name = threadName;
        thread=new Thread(this,name);
        System.out.println("This is the ChildThreadname--->" + thread.getName());
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i >= 5; i--) {
                System.out.println("This is the child Method count" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.out.println("This is the Exception");
        }
    }


}
class TestThis{
    public static void main(String[] args) {
        MoreCoplexThread moreCoplexThread1=new MoreCoplexThread("Thread1");
        MoreCoplexThread moreCoplexThread2=new MoreCoplexThread("Thread2");
        MoreCoplexThread moreCoplexThread3=new MoreCoplexThread("Thread3");
        System.out.println("Is Thread One Active"+moreCoplexThread1.thread.isAlive());
        System.out.println("Is Thread Two Active"+moreCoplexThread2.thread.isAlive());
        System.out.println("Is Thread One Active"+moreCoplexThread3.thread.isAlive());
        try{
            System.out.println("Waiting for Threads to finish....");
            moreCoplexThread1.thread.join();
            moreCoplexThread2.thread.join();
            moreCoplexThread3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Exception in Parent Thread");
        }
        System.out.println("Parent Thread Exited");
        System.out.println("Is Thread One Active"+moreCoplexThread1.thread.isAlive());
        System.out.println("Is Thread Two Active"+moreCoplexThread2.thread.isAlive());
        System.out.println("Is Thread One Active"+moreCoplexThread3.thread.isAlive());
    }
}
