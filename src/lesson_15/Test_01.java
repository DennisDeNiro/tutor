package lesson_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 8 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

//все остальные числа не деляться на два и не деляться на 3
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            String s = bf.readLine();
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            if (i % 3 == 0) {
                list1.add(list.get(i));
            }  if (i % 2 == 0 ) {
                list2.add(list.get(i));
            } if (i % 2 != 0 && i % 3 != 0){
                list3.add(list.get(i));
            }
        }
        printList(list3);
        System.out.print("-----");
        printList(list2);
        System.out.print("------");
        printList(list1);
    }

    public static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
