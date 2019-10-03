package com.company.lesson_41;

public class Test_02 {
    public static void main(String[] args) {
        SecondThread task = new SecondThread();
        Thread thread = new Thread(task);
        thread.start();
    }

    public static class SecondThread implements Runnable{
        @Override
        public void run() {
            System.out.println("Run");
        }
    }
}
