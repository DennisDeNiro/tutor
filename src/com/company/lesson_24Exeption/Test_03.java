package com.company.lesson_24Exeption;


import java.io.*;

/*
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String targetFileName = reader.readLine();

        InputStream inputStream = new FileInputStream(sourceFileName);
        OutputStream outputStream = new FileOutputStream(targetFileName);

        int count = 0;
        while (inputStream.available() > 0){
            int data = inputStream.read();
            outputStream.write(data);
            count++;
        }

        System.out.println(count);

        inputStream.close();
        outputStream.close();
    }
}
