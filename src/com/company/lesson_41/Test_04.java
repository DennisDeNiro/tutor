package com.company.lesson_41;

import java.util.concurrent.Callable;

public class Test_04 {
    public static void main(String[] args) {
        SecondThread sc = new SecondThread();
        FourThread fh = new FourThread();
        Thread thread = new Thread(sc);
        thread.start();
        fh.start();
    }

    public static class SecondThread implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
                System.out.println("Runnable is start!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class FourThread extends Thread {

        @Override
        public void run() {
            System.out.println("Runnable is start!");
        }
    }
}
