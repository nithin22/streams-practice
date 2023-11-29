package com.begginer.threads;

public class SynchronizedExample {
    synchronized void call(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            System.out.println("Exception Occureed");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{

    String msg;
    SynchronizedExample target;

    Thread thread;

    public Caller(SynchronizedExample targ,String s){
        target=targ;
        msg=s;
        thread=new Thread(this);
        thread.start();
    }



    @Override
    public void run() {
        target.call(msg);
    }
}

class Synch{
    public static void main(String[] args) {
        SynchronizedExample synchronizedExample= new SynchronizedExample();
        Caller syn1=new Caller(synchronizedExample,"HEllo");
        Caller syn2=new Caller(synchronizedExample,"This is");
        Caller syn3=new Caller(synchronizedExample,"Not");

        try{
            syn1.thread.join();
            syn2.thread.join();
            syn3.thread.join();
        }catch (InterruptedException ex){
            System.out.println("Exception");
        }
    }
}
