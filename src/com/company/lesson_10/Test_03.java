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

public class Test_03
{
    int b = 34;
    public static void main(String[] args) {
        Test_02 a = new Test_02();
    }
}
