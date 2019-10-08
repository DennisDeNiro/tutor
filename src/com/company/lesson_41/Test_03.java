package com.company.lesson_41;

public class Test_03 {
    public static void main(String[] args) {
        FirstThread fs = new FirstThread();
        fs.start();
    }

    public static class FirstThread extends Thread {
        @Override
        public void run() {
            System.out.println("first thread is running");
        }
    }
}
