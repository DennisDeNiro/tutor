package com.company.lesson_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Задача по алгоритмам.
// Есть массив чисел, в котором все числа дублируются, кроме одного. Найдите число, которое не имеет дубликатов в массиве.
// Пример ввода:
// {123456789, 65475264, 836133896, 836133896, 746254373, 1000000000,
//  542627588, 1000000000, 444088605, 65475264, 746254373, 542627588, 444088605}
// Пример вывода:
// 123456789
// TODO: 19.05.2019  
public class Test_01 {
    public static void main(String[] args) {
        int[] array = new int[]{123456789, 65475264, 836133896, 836133896, 746254373, 1000000000, 542627588, 1000000000, 444088605, 65475264, 746254373, 542627588, 444088605};
        System.out.println(singleNumber(array));
        System.out.println(singleNumber2(array));
    }

    private static int singleNumber(int[] arr){
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i+1]){
                return arr[i];
            } else i++;
        }

        return 0;
    }

    private static int singleNumber2(int[] arr){
        int res = 0;
        for (int i : arr) {
            res ^= i;
        }
        return res;
    }
}



