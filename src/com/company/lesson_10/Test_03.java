package com.company.lesson_10;
/*
1. Создать массив на 5 строк.
2. Создать массив на 5 чисел.
3. Ввести с клавиатуры 5 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
 индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

/*
    Stack -> primitives, local verb, obj ref   a, b=34
    Stack -> primitives, local verb, obj ref   a, b=34
    Stack -> primitives, local verb, obj ref   a, b=34
    Stack -> primitives, local verb, obj ref   a, b=34
    Stack -> primitives, local verb, obj ref   a, b=34
    Stack -> primitives, local verb, obj ref   a, b=34
    Stack -> primitives, local verb, obj ref   a, b=34
    Stack -> primitives, local verb, obj ref   a, b=34
    Heap -> objects  new Test_02 [[YG][OG]]  YG[[ES][SS]]  SS[[s1][s2]]
    Garbage collector
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_03 {

    public static void main(String[] args) throws IOException {
        String[] a = new String[5];
        int[] i = new int[5];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int q = 0; q < a.length; q++) {
            a[q] = bf.readLine();
        }
        for (int q = 0; q < i.length; q++) {
            i[q] = a.length;
        }
        for (int q = 0; q < i.length; q++) {
            System.out.println(i[q]);
        }
    }
}
