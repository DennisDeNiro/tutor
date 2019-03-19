package com.company.lesson_01;
// public protected default private
//

public class User {
    public static int count = 40; // 4byte[]
    public int age = 30;          // 200 [25][35][5]

    public static void main(String[] args) {
        byte b = 127; // 1 byte = 8 bit = 2^8 // Byte
        long l = 564389562436643l; // 16 byte // Long
        char c = '0'; // 2 byte = 16 bit // Character
        short s = 24533; // 2 byte // Short
        int i = 346732574; // 4 byte = 32 bit = 2^32 // Integer
        boolean bool = true; // 4 byte  // Boolean
        float f = 32.4f; // 4 byte // Float
        double d = 634.4; // 8 byte // Double
        String str = "50";
        Integer num = 50;

        int number = Integer.parseInt(str);

        System.out.println(number * 2);
        System.out.println("34577" + 50);
        System.out.println("34577 " + 50 + " " + i + " " + str);
        System.out.format("34577 50 %d %s %b %f", i, str, bool, f);

    }
}
