//package com.begginer.threads;
//
//public class FreshTreads {
//
//    void printString(String msg){
//        try {
//            System.out.println("[" + msg);
//            Thread.sleep(1000);
//        }catch (InterruptedException ex){
//            System.out.println("Here is the Exceptioin");
//        }
//    }
//}
//
//class CheckThis implements Runnable{
//
//    FreshTreads freshTreads;
//
//    Thread thread;
//
//    String msg;
//
//    CheckThis(String name,String msg,FreshTreads target){
//        thread.setName(name);
//        thread= new Thread(target);
//        thread.start();o
//    }
//
//
//
//    @Override
//    public void run() {
//        freshTreads.printString(msg);
//    }
//
//}
//
//class TestThis1{
//    public static void main(String[] args) {
//
//    }
//}
