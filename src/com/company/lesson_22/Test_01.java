package com.company.lesson_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/*
 Задача по алгоритмам. Факториал
 Найти факториал числа 10
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
//        System.out.println(fact1(30));
        System.out.println(fact2(10));
        System.out.println(fact2(9));
    }

    private static int fact1(int n){
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    private static Map<Integer, BigInteger> cache = new HashMap<>();
    private static BigInteger fact2(int n){
        BigInteger res;

        if(n == 0){
            return BigInteger.ONE;
        }

        if(cache.containsKey(n)){
            System.out.println("Cache");
            return cache.get(n);
        }

        res = BigInteger.valueOf(n).multiply(fact2(n-1));
        System.out.println(res);
        cache.put(n, res);
        return res;
    }

}
