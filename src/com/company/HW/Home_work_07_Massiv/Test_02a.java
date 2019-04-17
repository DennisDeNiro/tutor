package com.company.HW.Home_work_07_Massiv;
// Заполнение массива из 10 чисел, числами от 29 до 20
public class Test_02a
{
    public static void main(String[] args) {
        int[]a = new int[10];

        for(int i=0; i<a.length; i++){
            a[i]= 20+i;
        }
        for (int i = a.length-1; i>=0; i--){
            System.out.println(a[i]);
        }
    }
}
