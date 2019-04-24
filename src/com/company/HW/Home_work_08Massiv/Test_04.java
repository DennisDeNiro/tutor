package com.company.HW.Home_work_08Massiv;
//Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
// Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
public class Test_04 {
    public static void main(String[] args) {
        int [] z = new int[20];
       for (int i =0; i<z.length; i++) {
           if (i < 2) {
               z[i]=1;
           }else {
               z[i] = z[i-2]+z[i-1];// усли z =3 = (3-2)+(3-1)=3, 4= (4-2)+(4-1)=5 , 5 = (5-2)+(5-1)=7
           }
           System.out.println(z[i]);
       }
    }
}
