package com.company.lesson_30;

import java.io.*;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Если файла по заданному пути не существует, запросить ввод имени файла еще раз.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String firstFile = bf.readLine();
        String secondFile = bf.readLine();

        InputStream inputStream = new FileInputStream(firstFile);
        OutputStream outputStream = new FileOutputStream(secondFile);

        while (inputStream.available()>0){
            int data = inputStream.read();
            outputStream.write(data);
        }
        System.out.println(secondFile.);
    }
}
