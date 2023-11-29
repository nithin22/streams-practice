package com.begginer.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        thread.setName("My Thread");
        System.out.println("Current Thread: "+thread);

        try{
            for (int i=5;i>=0;i--){
                System.out.println(i);
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
    }
}
