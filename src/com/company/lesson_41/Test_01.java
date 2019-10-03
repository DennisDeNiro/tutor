package com.company.lesson_41;

public class Test_01 {
    public static void main(String[] args) {
        FirstThread thread = new FirstThread();
        thread.start();
        System.out.println("Main");
    }

    public static class FirstThread extends Thread{
        static {
            System.out.println("Static");
        }

        @Override
        public void run() {
            System.out.println("It's run method!");
        }
    }
}

