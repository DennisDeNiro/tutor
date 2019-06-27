package com.company.lesson_28;

public class Test_02 {
    public static void main(String[] args) {
//        method(new Test2());
        method(new Test1());
        method(new T());


    }

    private static void method(Object o){
        if(o instanceof Test1){
            System.out.println("Test1");
        } else if(o instanceof Test2){
            System.out.println("Test2");
        } else if(o instanceof Test3){
            System.out.println("Test3");
        }

        if(o instanceof T){
            System.out.println("T");
        }

        if(o.getClass().equals(T.class)){
            System.out.println("T");
        }
    }
}

class T{}
class Test1 extends T{}
class Test2{}
class Test3{}
