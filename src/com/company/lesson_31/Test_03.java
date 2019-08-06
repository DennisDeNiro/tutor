package com.company.lesson_31;

class SuperBase {
    public int i = 3;
    public void mm(Object o) {
        System.out.println("Object  " + i);
    }
    public void mm(String o) {
        System.out.println("String  " + i);
    }
}

 class Base extends SuperBase {
    public Base() {
        i = 5;
    }
    public static void main(String[] args) {
        SuperBase sb = new Base();
        Object o = "";
        sb.mm(o);
        sb.mm("");
    }
}
