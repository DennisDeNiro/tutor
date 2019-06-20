package com.company.lesson_26;

import java.io.*;

/*
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String inputFile = bf.readLine();
        String outputFile = bf.readLine();

        try{

        }catch (Exception e){
            System.out.println("Програма скопирована");
        }
        InputStream inputStream = new FileInputStream(inputFile);
        OutputStream outputStream = new FileOutputStream(outputFile);

        inputStream.close();
        outputStream.close();
    }
}
