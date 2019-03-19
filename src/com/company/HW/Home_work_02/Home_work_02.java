package com.company.HW.Home_work_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.
Пример:
Коля получает 3000 через 5 лет.
*/
public class Home_work_02
{
  public static void main(String[] args) throws IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Введите Ваше имя" + "\n");
      String st = bf.readLine();

      System.out.println("Введите число");
      String st2 = bf.readLine();
      int number = Integer.parseInt(st2);

      System.out.println("Введите число");
      String st3 = bf.readLine();
      int number2 = Integer.parseInt(st3);

      System.out.println(st + " получает " + number + " через " + number2 + " лет.");


  }
}
