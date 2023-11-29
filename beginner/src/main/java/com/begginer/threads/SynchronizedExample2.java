//package com.begginer.threads;
//
//public class SynchronizedExample2 {
//  /*  synchronized */void call(String msg){
//        System.out.print("["+msg);
//        try{
//            Thread.sleep(1000);
//        }catch (InterruptedException ex){
//            System.out.println("Exception Occureed");
//        }
//        System.out.println("]");
//    }
//}
//
//class Caller1 implements Runnable{
//
//    String msg;
//    SynchronizedExample target;
//
//    Thread thread;
//
//    public Caller1(SynchronizedExample targ,String s){
//        target=targ;
//        msg=s;
//        thread=new Thread(this);
//        thread.start();
//    }
//
//
//
//    @Override
//    public void run() {
//        target.call(msg);
//    }
//}
//
//class Synch1{
//    public static void main(String[] args) {
//        SynchronizedExample2 synchronizedExample= new SynchronizedExample2();
//        Caller1 syn1=new Caller1(synchronizedExample,"HEllo");
//        Caller1 syn2=new Caller1(synchronizedExample,"This is");
//        Caller1 syn3=new Caller1(synchronizedExample,"Not");
//
//        try{
//            syn1.thread.join();
//            syn2.thread.join();
//            syn3.thread.join();
//        }catch (InterruptedException ex){
//            System.out.println("Exception");
//        }
//    }
//}
